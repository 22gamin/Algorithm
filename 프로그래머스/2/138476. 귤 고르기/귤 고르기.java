import java.util.*;
import java.io.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : tangerine){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        List<Map.Entry<Integer, Integer>> sortMap = new ArrayList<>(map.entrySet());
        sortMap.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        
        int kind = 0;
        for(Map.Entry<Integer,Integer> entry : sortMap){
            if (k <= 0) break;
            
            kind++;
            k -= entry.getValue();
            
        }
        return kind;
    }
}