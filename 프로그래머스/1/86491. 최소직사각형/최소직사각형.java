import java.util.*;
import java.io.*;

//큰거 앞에 두기
//크작순
class Solution {
    public int solution(int[][] sizes) {
        int firstMax = 0;
        int lastMax = 0;
        
        for(int i = 0; i<sizes.length; i++){
            Arrays.sort(sizes[i]);
            
            firstMax = Math.max(sizes[i][0], firstMax);
            lastMax = Math.max(sizes[i][1], lastMax);
        }
        
        return firstMax*lastMax;
    }
}