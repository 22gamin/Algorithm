import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		
		int[] dp = new int[12];
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;

		
		for(int i = 4; i<12; i++) {
			dp[i] = dp[i-3]+dp[i-2]+dp[i-1];
		}
		
		for(int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();
			sb.append(dp[n]).append("\n");
		}
		System.out.println(sb);
	}

}
