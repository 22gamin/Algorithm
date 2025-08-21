import java.io.*;
import java.util.*;

public class Solution {

	static int N,M,sure,yes;
	static List<List<Integer>> large ;
	static List<List<Integer>> tiny;
	static boolean[] visited;
	
	static void dfs(List<List<Integer>> list, int start) {
		
		for(int num : list.get(start)) {
			if (!visited[num]) {
				visited[num] = true;
				sure++;
				dfs(list,num);
			}
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for(int tc = 1; tc< T+1; tc++) {
			N = Integer.parseInt(br.readLine());
			M = Integer.parseInt(br.readLine());
			
			large  = new ArrayList<>();
			tiny  = new ArrayList<>();
			
			for(int i = 0; i< N+1; i++) {
				large.add(new ArrayList<>());
				tiny.add(new ArrayList<>());
			}
			

			
			for(int i =0; i<M; i++ ) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				large.get(a).add(b);
				tiny.get(b).add(a);
			}
			
			// 입력 끝 -----
			
			yes = 0;
			
			for(int j =1; j<N+1; j++) {
				sure = 0;
				visited = new boolean[N+1];
				visited[j] = true;
				dfs(large,j);
				
				visited = new boolean[N+1];
				visited[j] = true;
				dfs(tiny,j);
				
				if (sure == N-1) yes++;
			}
			
			sb.append("#").append(tc).append(" ").append(yes).append("\n");
		}
		System.out.println(sb.toString());
	}

}
