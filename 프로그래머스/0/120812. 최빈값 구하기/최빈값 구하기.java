
import java.util.*;

class Solution {
    public int solution(int[] array) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        // 각 원소의 개수 넣음
        for (int i : array){
            if (map.containsKey(i)){
                int value = map.get(i);
                map.put(i, value+1);
            }
            else{
                map.put(i,1);
            }
        }
        
        // 그 중 가장 큰 값 -> 최빈값
        
        int maxValue = Integer.MIN_VALUE; // 초기값은 최소한으로 설정
        List<Integer> list = new ArrayList<>();
        
        for (int i : map.values()){
            if (i > maxValue )
                maxValue = i;
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue)
                list.add(entry.getKey());
        }
        
        if (list.size() > 1)
            return -1;
        
    
  
    return list.get(0);
    }
}