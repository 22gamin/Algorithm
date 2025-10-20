import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int cnt = 0;
		int[] dp = new int[N+1];
		
		if(N == 1) {
			System.out.println(0);
			return;
		}
		else if(N == 2) {
			System.out.println(1);
			return;
		}
		
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		
		for(int i = 4; i<N+1; i++) {
			
			dp[i] = dp[i-1]+dp[1];
			
			if(i%3 == 0 ) {
				dp[i] = Math.min(dp[i], dp[i/3]+1);
			} 
			if(i%2 == 0) {
				dp[i] = Math.min(dp[i], dp[i/2]+1);
			} 
			
			
		}
		
		System.out.println(dp[N]);
	}
	

	
}
