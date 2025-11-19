import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] coin = new int[n];
		int[] dp = new int[k+1];
		
		Arrays.fill(dp, 100001);
		
		dp[0] = 0;
		
		for(int i =0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			coin[i] = Integer.parseInt(st.nextToken());
		} //입력 끝
		
		
		//동전의 종류만큼 반복
		for(int c : coin) {
			for(int j = c; j<=k; j++) {
				//이전 동전만으로
				dp[j] = Math.min(dp[j], dp[j-c]+1);
			}
		}
		
		if(dp[k] == 100001) {
			System.out.println(-1);
		} else {
			System.out.println(dp[k]);
		}
		
	}

}
