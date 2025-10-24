import java.util.*;
import java.io.*;

public class Main {
	static int N;
	
	public static class dot implements Comparable<dot> {
		int x;
		int y;
		
		public dot(int x,int y) {
			this.x = x;
			this.y = y;
		}
		
		@Override
		public int compareTo(dot o) {
			if(this.x == o.x) return this.y - o.y;
			return this.x - o.x;
		}
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		
		PriorityQueue<dot> pq = new PriorityQueue<>();
		for(int n = 0; n<N; n++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			pq.add(new dot(x,y));
		}
		
		for(int n = 0; n<N; n++) {
			dot d = pq.poll();
			sb.append(d.x).append(" ").append(d.y).append("\n");
		}
		System.out.println(sb);
	}

}
