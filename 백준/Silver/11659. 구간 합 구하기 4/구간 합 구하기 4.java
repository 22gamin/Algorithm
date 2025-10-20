import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] seq = new int[N+1];
		int[] dp = new int[N+1];
		
		st = new StringTokenizer(br.readLine());
		for(int n = 1; n<N+1; n++) {
			seq[n] = Integer.parseInt(st.nextToken());
		}
		
		//dp만들기
		for(int i = 1; i<N+1; i++) {
			dp[i] = dp[i-1] + seq[i];
		}
		
		for(int m = 0; m<M; m++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append(dp[b]-dp[a-1]).append("\n");
		}
		System.out.println(sb);
	}

}
