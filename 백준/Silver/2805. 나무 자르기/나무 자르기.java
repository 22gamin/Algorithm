import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] trees = new int[N];
		
		st = new StringTokenizer(br.readLine());
		
		int max = 0;
		for(int n = 0; n<N; n++) {
			trees[n] = Integer.parseInt(st.nextToken());
			max = Math.max(max, trees[n]);
		}
		//입력 끝
		
		long low = 0;
		long high = max;
		
		long result = 0;
		
		while(low <= high) {
			
			long mid = low + (high-low)/2;
			long sum = 0;
			
			
			for(int i = 0; i<N; i++) {
				if (mid < trees[i]) sum+=(trees[i]-mid);
			}

			if(sum >= M) {
				result = mid;
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		System.out.println(result);
	}

}
