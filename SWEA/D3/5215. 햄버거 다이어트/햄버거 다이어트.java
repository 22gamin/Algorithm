import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int tc =1; tc<T+1; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken()); //재료 수
            int L = Integer.parseInt(st.nextToken()); //제한 칼로리

            int[] score = new int[N + 1];
            int[] kcal = new int[N + 1];
            int[][] dp = new int[N + 1][L + 1];

            for (int n = 1; n<N+1; n++){
                st = new StringTokenizer(br.readLine());

                score[n] = Integer.parseInt(st.nextToken());
                kcal[n] = Integer.parseInt(st.nextToken());
            }

            dp[0][0] = 0;

            for(int i = 1; i<N+1; i++){
                for(int j = 1; j<L+1; j++){
                    if (kcal[i] > j) {
                        dp[i][j] = dp[i - 1][j];
                    }
                    else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - kcal[i]] + score[i]);
                    }
                }
            }
            sb.append('#').append(tc).append(" ").append(dp[N][L]).append("\n");
        }
        System.out.print(sb);
    }
}
