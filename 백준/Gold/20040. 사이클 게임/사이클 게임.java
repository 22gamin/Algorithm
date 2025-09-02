import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[] parent;
	static boolean CycleCheck;
	
	public static int find(int idx) {
		if(parent[idx]==idx) return idx;
		
		return parent[idx] = find(parent[idx]);
 
	}
	
	public static void union(int a, int b, int i) {
		a = find(a);
		b = find(b);
		
		if(a==b) {
			System.out.println(i+1);
			CycleCheck=true;
			return;
		}
		parent[b]=a;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		parent = new int[N];
		
		for(int i=0; i<N; i++) parent[i]=i;
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			union(x,y,i);
			if(CycleCheck) return;
		}
		System.out.println(0);
		
	}
}
