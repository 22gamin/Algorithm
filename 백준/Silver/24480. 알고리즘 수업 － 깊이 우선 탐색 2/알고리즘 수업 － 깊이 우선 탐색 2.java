import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static int[] visited;
	public static List<Integer>[] graph;
	public static int n, order=1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		visited = new int[n+1];
		graph = new List[n+1];
		for(int i=1; i<=n; i++) {
			graph[i] = new LinkedList<>();
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph[u].add(v);
			graph[v].add(u);
		}
		
		for(int i=1; i<=n; i++) {
			graph[i].sort((a,b) -> b-a);
		}
		
		dfs(r);
		
		for(int i=1; i<=n; i++) { 
			System.out.println(visited[i]);
		}
	}
	
	private static void dfs(int r) {
		visited[r] = order++;
		
		for(int i : graph[r]) {
			if(visited[i]==0) {
				dfs(i);
			}
		}
	}
}