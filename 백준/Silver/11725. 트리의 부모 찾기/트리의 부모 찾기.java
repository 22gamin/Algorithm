import java.io.*;
import java.util.*;

public class Main {
	
	static List<List<Integer>> graph = new ArrayList<>();
	static boolean[] visited;
	static int[] answer;
	
	static void dfs(int start) {

		for(int node : graph.get(start)) {
			if (!visited[node]) {
				visited[node] = true;
				answer[node] = start;
				dfs(node);
			}
				
		}
	}
	
	public static void main(String[] args) throws IOException {
	
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<N+1; i++) {
			graph.add(new ArrayList<>());
		}
		
		visited = new boolean[N+1];
		answer = new int[N+1];
		
		//간선 입력
		for (int j = 1; j<N; j++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			graph.get(a).add(b);
			graph.get(b).add(a);

		}
		visited[1] = true;
		dfs(1);
		
		for(int m= 2; m<answer.length; m++)
			System.out.println(answer[m]);
	}
}
