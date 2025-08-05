import java.io.*;
import java.util.*;

public class Main {
	
	static int[][] graph; 
	static boolean[][] visited;
	static int[][] cnt;
	static int[] dx = new int[] {1,0,-1,0};
	static int[] dy = new int[] {0,1,0,-1};
	
	
	public static void main(String[] args) throws IOException {
		
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //세로
		int M = Integer.parseInt(st.nextToken()); //가로
		
		graph = new int[N+1][M+1]; 
		visited = new boolean[N+1][M+1]; 
		
		for(int i = 1; i<N+1; i++) {
			String str = br.readLine();
			for (int j = 1; j<M+1; j++) {
				graph[i][j] = str.charAt(j-1)-'0';
			}
		}
		
		//bfs
		int[][] cnt = new int[N+1][M+1];
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {1,1});
		cnt[1][1] = 1;
		visited[1][1] = true;
		
		
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			int x = current[0];
			int y = current[1];
			
			for(int i =0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if (nx <= 0 || ny <= 0|| nx > N || ny > M) {
					continue;}
				else if(graph[nx][ny] == 1 && visited[nx][ny] == false) {
					visited[nx][ny] = true;
					queue.add(new int[]{nx,ny});
					cnt[nx][ny] = cnt[x][y] + 1;
				}
			}
		}
		System.out.println(cnt[N][M]);
	}
}
