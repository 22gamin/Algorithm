import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String name : participant){
            map.put(name, map.getOrDefault(name,0)+1);
        }
        
        HashSet<String> set = new HashSet<>(Arrays.asList(participant));
        for(String name : completion){
            if (map.containsKey(name) && map.get(name) >=2){ //동명이인
                map.put(name,map.get(name)-1);
            } else {
                set.remove(name);
            }
        }
        List<String> list = new ArrayList<>(set);
        return list.get(0);
    }
}