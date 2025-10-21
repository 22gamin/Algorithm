import java.util.*;
import java.io.*;

public class Main {
	
	static class dot implements Comparable<dot>{
		int x;
		int idx;
		
		public dot(int x, int idx) {
			this.x = x;
			this.idx = idx;
		}
		
		@Override
		public int compareTo(dot o) {
			return this.x - o.x;
		}
		
		@Override
		public String toString() {
			return "[" + x + "," + idx +"]";
		}
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		dot[] line = new dot[N];
		int[] answer = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N; i++) {
			line[i] = new dot(Integer.parseInt(st.nextToken()),i);
		}
		//입력 끝
		
		Arrays.sort(line);
		
		int sum = -1;
		int last = line[N-1].x;
		
		if (last != line[0].x) {
			
			for(int i = 0; i<N; i++) {
				if(last != line[i].x) {
					sum++;
					last = line[i].x;
				}
				answer[line[i].idx] = sum;
				
			}
		}
		
		for(int i =0; i<N; i++) {
			sb.append(answer[i]).append(" ");
		}
		System.out.println(sb);
	}

}
