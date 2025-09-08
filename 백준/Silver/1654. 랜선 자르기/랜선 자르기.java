import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int[] len = new int[k];
		int max_len = Integer.MIN_VALUE;
		for(int i=0; i<k; i++) {
			len[i] = Integer.parseInt(br.readLine());
			
			if(max_len<len[i]) max_len = len[i];
		}
		
		long low = 1, high = max_len, ans=0;
		while(low <= high) {
			long mid = (low + high) / 2;
			long count = 0;
			
			for(int L : len) {
				count += (L/mid);
			}
			
			if(count >= n) {
				ans = mid;
				low  = mid+1;
			} else {
				high = mid-1;
			}
			
		}
		
		System.out.println(ans);
		
	}
}
