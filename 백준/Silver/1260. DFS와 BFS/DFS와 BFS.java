import java.io.*;
import java.util.*;

public class Main {
	
	//---------------------dfs-------------------
	static void DFS(int start,int N, int[][] graph,boolean[] visited,List<Integer> arr) {
		for (int k =1; k<N+1;k++) {
			if (graph[start][k] == 1 && visited[k] == false) {
				visited[k] = true;
				arr.add(k);
				DFS(k,N,graph,visited,arr);
			}
		}
	}
	

	public static void main(String[] args) throws IOException {
		
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int[][] graph = new int[N+1][N+1];
		boolean[] visited = new boolean[N+1];
		List<Integer> arr = new LinkedList<>();
		
		
		for (int i = 0; i < M; i ++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st2.nextToken());
			int b = Integer.parseInt(st2.nextToken());
			
			graph[a][b] = graph[b][a] = 1;
		}
		
		//---------------------dfs-------------------
		visited[V] = true;
		arr.add(V);
		DFS(V,N,graph,visited,arr);
		
		//---------------------bfs-------------------
		
		boolean[] visited2 = new boolean[N+1];
		List<Integer> arr2 = new LinkedList<>();
		
		//판별
		Queue<Integer> queue = new LinkedList<>(); 
		queue.add(V);
		arr2.add(V);
		visited2[V] = true;
		
		while(!queue.isEmpty()) {
			int current = queue.poll();
			
			//숫자가 작은 순으로 방문
			for(int j = 1; j<N+1; j++) {
				if (graph[current][j] ==1 && visited2[j] ==false) {
					visited2[j] = true;
					queue.add(j);
					arr2.add(j);
				}
			}
		}
		//dfs 출력
		for(int l = 0; l<arr.size(); l++) {
			System.out.print(arr.get(l)+" ");
		}
		System.out.println();
		//bfs 출력
		for(int l = 0; l<arr.size(); l++) {
			System.out.print(arr2.get(l)+" ");
		}
	}
}
