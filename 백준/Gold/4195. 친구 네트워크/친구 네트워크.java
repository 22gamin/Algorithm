import java.util.*;
import java.io.*;

public class Main {
	static int parents[], size[];
	
	static int find(int a) {
		if (parents[a] == a)
			return a;
		return parents[a] = find(parents[a]);
	}
	
	static int union(int a, int b) {
		a = find(a);
		b = find(b);
		
		if (a == b) {
			return size[a];
		}
		
		if (a > b) {
			parents[b] = a;
			size[a] += size[b];
			return size[a];
		} else {
			parents[a] = b;
			size[b] += size[a];
			return size[b];
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc<T; tc++) {
			int F = Integer.parseInt(br.readLine());
			
			Map<String,Integer> map = new HashMap<>();  // 이름별 아이디 저장
			parents = new int[F*2+1];
			size = new int[F*2+1];
			
			int idx = 1;
			
			for(int f = 0; f<F; f++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				String name1 = st.nextToken();
				String name2 = st.nextToken();
				
				if (!map.containsKey(name1)) {
					parents[idx] = idx;
					size[idx] = 1;
					map.put(name1, idx++);
				}
				
				if (!map.containsKey(name2)) {
					parents[idx] = idx;
					size[idx] = 1;
					map.put(name2, idx++);
				}
				
				sb.append(union(map.get(name1), map.get(name2))).append("\n");
			}
		}
		System.out.println(sb);

	}

}
