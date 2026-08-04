import java.util.*;
import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t<T; t++){
            int tc = Integer.parseInt(br.readLine());
            sb.append('#').append(tc).append(" ");
            StringTokenizer st = new StringTokenizer(br.readLine());

            Map<Integer, Integer> score = new HashMap<>();

            for(int i = 0; i<1000; i++){
                int s = Integer.parseInt(st.nextToken());
                score.put(s, score.getOrDefault(s,0)+1);
            }


            List<Map.Entry<Integer,Integer>> entries = new ArrayList<>(score.entrySet());

            //값 기준으로 정렬
            entries.sort((a, b) -> b.getValue() - a.getValue());

            int max = -1;
            int maxScore = -1;

            for(Map.Entry<Integer, Integer> e : entries){
                if (max < e.getValue()) {
                    max = e.getValue();
                    maxScore = e.getKey();
                }
                else if (max == e.getValue()) maxScore=e.getKey();
                else break;
            }
            sb.append(maxScore).append("\n");

        }
        System.out.print(sb);
    }
}
