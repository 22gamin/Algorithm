import java.util.*;
import java.io.*;

//yellow 약수 구해서 2x+2y+4 = brown 나오게

class Solution {
    public int[] solution(int brown, int yellow) {
        
        List<int[]> divisor = new ArrayList<>();
        
        int[] answer = {};
        if (yellow == 1) answer = new int[]{3,3};
        
        //약수 모음
        for(int i = 1; i*i<=yellow; i++){
            if (yellow%i == 0) divisor.add(new int[]{i, yellow/i});
        }
        
        for(int[] arr : divisor){
            if ((arr[0]*2)+(arr[1]*2) + 4 == brown) answer = new int[]{arr[1]+2,arr[0]+2};
        }
        return answer;
    }
}