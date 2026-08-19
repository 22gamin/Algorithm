import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] ones  = {1, 2, 3, 4, 5}; //주기 5
        int[] twos  = {2, 1, 2, 3, 2, 4, 2, 5}; //주기 8
        int[] threes  = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};  //주기 10
        
        int one = 0, two = 0, three = 0;
        
        for(int idx = 0; idx<answers.length; idx++){
            if (ones[idx%5] == answers[idx]) one++;
            if (twos[idx%8] == answers[idx]) two++;
            if (threes[idx%10] == answers[idx]) three++;
        }
        
        int[] score = {one,two,three};
        
        int max = Math.max(one, Math.max(two,three));
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i<3; i++){
            if (score[i] == max) arr.add(i+1);
        }
        int[] answer = new int[arr.size()];
        
        for(int i = 0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}