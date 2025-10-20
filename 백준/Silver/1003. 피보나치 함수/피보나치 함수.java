import java.util.*;
import java.io.*;

public class Main {
	static int zero,one,dp[][];

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		dp = new int[50][2];
		
		dp[0] = new int[]{1,0};
		dp[1] = new int[] {0,1};
		
		for(int i = 2; i<41; i++) {
			dp[i][0] = dp[i-1][0] + dp[i-2][0];
			dp[i][1] = dp[i-1][1] + dp[i-2][1];
			
		}

		for(int tc = 0; tc<T; tc++) {
			int num = sc.nextInt();
			System.out.println(dp[num][0] + " "+dp[num][1]);
		}

		
	}

	static int fib(int n) {
		if(n==0) {
			zero++;
			return 0;
			
		} else if(n==1) {
			one++;
			return 1;
		} else {
			return fib(n-1) + fib(n-2);
		}
			
		}
}
