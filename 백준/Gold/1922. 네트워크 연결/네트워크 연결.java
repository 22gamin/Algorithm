import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static class Edge implements Comparable<Edge>{
		int from;
		int to;
		int weight;
		
		public Edge(int from, int to, int weight) {
			super();
			this.from=from;
			this.to=to;
			this.weight=weight;
		}
		
		@Override
		public int compareTo(Edge o) {
			return Integer.compare(this.weight, o.weight);
		}
	}
	
	static Edge[] edgeList;
	static int[] parents;
	static int N, M;
	
	private static void make() {
		for(int i=1; i<=N; i++) {
			parents[i] = i;
		}
	}
	
	private static int find(int a) {
		if(a==parents[a]) return a;
		return parents[a] = find(parents[a]);
	}
	
	private static boolean union(int a, int b) {
		int aRoot = find(a);
		int bRoot = find(b);
		if(aRoot == bRoot) return false;
		
		if(aRoot > bRoot) parents[bRoot] = aRoot;
		else parents[aRoot] = bRoot;
		
		return true;
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		
		edgeList = new Edge[M];
		parents = new int[N+1];
		
		for(int i=0; i<M; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			edgeList[i] = new Edge(a,b,c);
			
		}
		
		Arrays.sort(edgeList);
		make();
		
		int result = 0;
		int cnt = 0;
		
		for(Edge edge : edgeList) {
			if(!union(edge.from, edge.to)) continue;
			
			result += edge.weight;
			if(++cnt == N-1) break;
		}
		
		System.out.println(result);
		
	}
}