import java.util.*;
import java.io.*;

public class Main {
	static int[] dx = {-1,-1,-1,0,0,1,1,1};  //대각선을 위한 8방향
	static int[] dy = {-1,0,1,-1,1,-1,0,1};
	static int w,h,graph[][],visited[][];
	
	static void bfs(int startX, int startY) {
		Queue<int[]> queue = new LinkedList<>();
		
		queue.add(new int[] {startX, startY});
		
		while(!queue.isEmpty()) {
			int[] curr = queue.poll();
			
			for(int i = 0; i<8; i++) {
				int x = curr[0] + dx[i];
				int y = curr[1] + dy[i];
				
				if (x>= 0 && y>= 0 && x<w && y<h && graph[x][y] == 1 && visited[x][y] != 1) {
					visited[x][y] = 1;
					queue.offer(new int[] {x,y});
				}
			}
		}

	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		w = -1;
		h = -1;
		for(;;) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			if (w == 0 && h == 0) break;
			
			graph = new int[w][h];
			visited = new int[w][h];
			

			for(int he = 0; he < h; he++) {
				st = new StringTokenizer(br.readLine());

				for(int we = 0; we < w; we++) {
					graph[we][he] = Integer.parseInt(st.nextToken());

				}
			} //입력 끝
			int sum = 0;
			for(int x = 0; x < w; x++) {
				for(int y = 0; y<h; y++) {
					if (graph[x][y] == 1 && visited[x][y] == 0) {
						bfs(x,y);
						sum++;

					}
				}
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
		
	}

}
