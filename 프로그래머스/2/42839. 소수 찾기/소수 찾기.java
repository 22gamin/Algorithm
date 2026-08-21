import java.util.*;
import java.io.*;

//11, 011은 같음
//숫자별로 조합 만들고 저장 후 소수 판별

class Solution {
    public int solution(String numbers) {
        char[] numbersCh = numbers.toCharArray();
        boolean[] used = new boolean[numbersCh.length];
        Set<Integer> nums = new HashSet<>();
        String str = "";
        
        find(numbersCh, used, str,0,nums); //숫자 조합 찾기
        
        return cal(nums);
    }
    
    public void find(char[] numbersCh, boolean[] used, String str, int cnt, Set<Integer> nums){
        for(int idx = 0; idx < numbersCh.length; idx++){
            
            if (cnt == numbersCh.length){
                if (str.equals("")) return;
                nums.add(Integer.parseInt(str));
                return;
            }
            
            if (!used[idx]){
                //안 넣기
                find(numbersCh, used, str, cnt+1, nums);

                //넣기
                used[idx] = true;
                find(numbersCh, used, str+numbersCh[idx], cnt+1, nums);

                used[idx] = false;

            }
            
        }
    }
    
    public int cal(Set<Integer> nums){
        int count = 0;
        
        for(int num : nums){
            boolean isPrime = true;
            if (num < 2) continue;
            for(int i = 2; i*i<= num; i++){
                if (num % i == 0) { //소수아님
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) count++;
        }
        return count;
    }
}
