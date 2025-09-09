import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		int sum=0,max=0;
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		
			sum += arr[i];
			max = Math.max(max, arr[i]);
		}
		
		int low=max, high=sum;
		while(low<=high) {
			int mid = (low+high)/2;
			
			long count=1, total=0;
			for(int i=0; i<n; i++) {
				if(total+arr[i]>mid) {
					count++;
					total=arr[i];
				} else {
					total+=arr[i];
				}
			}
			
			if(count <= m) {
				high=mid-1;
			} else {
				low=mid+1;
			}
			
		}
		System.out.println(low);
	}
}