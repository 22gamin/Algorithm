import java.util.*;
import java.io.*;
 
public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
 
        for(int tc = 1; tc<T+1; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            String S1 = st.nextToken();
            String S2 = st.nextToken();
 
            int[] S1Cnt = new int[26];
            int[] S2Win = new int[26];
            int cnt = 0;
 
            //첫번째 윈도우 세팅
            for(int i = 0; i<S1.length(); i++){
                S1Cnt[S1.charAt(i) - 'a']++;
                S2Win[S2.charAt(i) - 'a']++;
            }
 
            //첫번째 애나그램인지 확인
            if (Arrays.equals(S1Cnt, S2Win)) cnt++;
 
            for(int i = S1.length(); i< S2.length(); i++){
                S2Win[S2.charAt(i) - 'a']++;
                S2Win[S2.charAt(i-S1.length()) - 'a']--;
 
                if(Arrays.equals(S1Cnt,S2Win)) cnt++;
            }
            sb.append('#').append(tc).append(" ").append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}
