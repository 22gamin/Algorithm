import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int z =  (int) ((long) y * 100 / x);
		
		int ans=-1;
		
		int low=0, high=(int)1e9;
		while(low<=high) {
			int mid = (low+high)/2;
			
			int nz = (int) ((long) (y + mid) * 100 / (x + mid));
			if(nz!=z) {
				ans = mid;
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		System.out.println(ans);
		
	}
}