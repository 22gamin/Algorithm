import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		HashSet<Integer> set = new HashSet<>(); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] ans = new int[m];
		for(int i=0; i<m; i++) {
			int num = Integer.parseInt(st.nextToken());
			ans[i] = set.contains(num) ? 1 : 0;
		}
		
		for(int answer : ans) System.out.print(answer + " ");
	}
}
