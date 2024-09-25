import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        char last = 'A';
        
        for (int i = 1; i <= n; i++){
            map.put(i,0);
        }
        
        for (String s : words){
            char[] word = s.toCharArray();
            int person = Arrays.asList(words).indexOf(s)%n+1;
            
            //처음
            if (map.get(1) == 0){
                last = word[word.length-1];
                arr.add(s);
                map.put(person, map.get(person)+1);
            }
            
            //했던 단어
            else if (arr.contains(s)){
                int sp = Arrays.asList(words).lastIndexOf(s)%n+1;
                return new int[]{sp,map.get(sp)+1};
            }
            
            // 끝말 안 맞춤
            else if(word[0] != last){
                return new int[]{person,map.get(person)+1};
            }
    
            else{
                last = word[word.length-1];
                map.put(person,map.get(person)+1);
                arr.add(s);
            }

        }


        return new int[]{0,0};
    }
}