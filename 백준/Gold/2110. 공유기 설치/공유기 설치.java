import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int[] x = new int[n];
		for(int i=0; i<n; i++) {
			x[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(x);
		
		// 최대, 최소 간격
		int low = 1;
		int high = x[n-1]-x[0];
		int ans = 0;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(canPlace(x, c, mid)) {
				ans = mid;
				low = mid+1;
			} else {
				high = mid-1;
			}
		}
		
		System.out.println(ans);
	}
	
	private static boolean canPlace(int[] x, int c, int d) {
		int cnt=1;
		int last=x[0];
		
		for(int i=1; i<x.length; i++) {
			if(x[i]-last>=d) {
				cnt++;
				last=x[i];
				if(cnt>=c) return true;
			}
		}
		
		return false;
	}
}