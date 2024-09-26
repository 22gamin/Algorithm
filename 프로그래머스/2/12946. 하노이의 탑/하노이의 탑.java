import java.util.*;

class Solution {
    
    private static List<int[]> arr;
    
    public int[][] solution(int n) {
        
        arr = new ArrayList<>();
        dfs(n,1,3,2);
        
        int[][] answer = new int[arr.size()][];
        
        for (int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
    
    public static void dfs(int n, int start,int stop, int mid){
        if (n == 1){
            arr.add(new int[]{start,stop});
            return ;
        }
        
        dfs(n-1,start,mid,stop);
        arr.add(new int[]{start,stop});
        dfs(n-1,mid,stop,start);
    }
}

// 빈 곳에 넣을거임
// n-1까지는 2번 타워에 세워야함
// 재귀함수에 도착할 기둥까지 넣어줘야할듯?
// dfs(5,3) = ?
// dfs(4,2) + dfs(1,3)
// 2*dfs(3,2) + dfs(1,3)
// 2*dfs(2,2) + dfs(1,3)
// 2*dfs(1,2) + dfs(1,3) = dfs(1,2) + dfs(1,3) + dfs(2,3)