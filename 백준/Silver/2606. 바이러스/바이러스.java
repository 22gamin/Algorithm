import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int[][] graph = new int[N+1][N+1];
		boolean[] visited = new boolean[N+1];
		int cnt = 0;
		
		for (int i = 1; i < M+1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			graph[a][b] = graph[b][a] = 1;
		}
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		visited[1] = true;
		
		while(!queue.isEmpty()) {
			int current = queue.poll();
			for (int j =1; j<N+1; j++) {
				if (graph[current][j] == 1 && visited[j] == false) {
					visited[j] = true;
					cnt ++;
					queue.add(j);
				}
			}
		}
		System.out.println(cnt);
		
	}
}
