import java.io.*;
import java.util.*;


public class Solution {
	
	static List<List<Integer>> graph;
	static boolean[] visited;
	static List<Integer> arr = new ArrayList<>();
	 
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		for(int tc = 1; tc < 11; tc++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int S = Integer.parseInt(st.nextToken());
			int start = Integer.parseInt(st.nextToken());
			
			graph = new ArrayList<>();
			
			for(int i = 0; i<101; i++) {
				graph.add(new ArrayList<>());
			}
			
			visited = new boolean[101];
			
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i<S/2; i++) {
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				graph.get(a).add(b);
			}
			
			// 입력 끝 -----
			bfs(0,start);
			
			Collections.sort(arr);
			
			
			sb.append("#").append(tc).append(" ").append(arr.get(arr.size()-1)).append("\n");
			
		}

		System.out.println(sb);
	}
	
	public static void bfs(int depths, int start) {
		
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {start,depths});
		visited[start] = true;
		int max = 0;
		
		while(!queue.isEmpty()) {
			int[] curr = queue.poll();
			
			if (max < curr[1]) {
				max = curr[1];
				arr = new ArrayList<>();
				arr.add(curr[0]);
			}
			
			else if (max == curr[1]) {
				arr.add(curr[0]);
			}
			
			for(int num : graph.get(curr[0])) {
				if (!visited[num]) {
					visited[num] = true;
					queue.add(new int[] {num,curr[1]+1});
				}
			}
		}
	}
}