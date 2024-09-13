import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        
        for (String s: targets){
            int cnt = 0;
            for (char c : s.toCharArray()){
                int minValue = 101;
                for ( String key : keymap){
                    int value = key.indexOf(c) + 1;
                    
                    if (value > 0 && value < minValue) 
                        minValue = value;
                }

                if (minValue == 101){
                    cnt = -1;
                    break;
                }
                else
                    cnt += minValue;
            }

            answer.add(cnt);
        }
        
        int[] arr = new int[answer.size()];
        
        for (int j=0; j < answer.size(); j++){
            arr[j] = answer.get(j); 
        }
        return arr;
    }
}