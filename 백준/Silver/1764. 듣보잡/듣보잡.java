import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Set<String> listen = new HashSet<>();
		Set<String> look = new HashSet<>();
		
		for(int n = 0; n<N; n++) {
			st = new StringTokenizer(br.readLine());
			listen.add(st.nextToken());
		}
		
		for(int m = 0; m<M; m++) {
			st = new StringTokenizer(br.readLine());
			look.add(st.nextToken());
		}
		
		//입력 끝
		
		listen.retainAll(look);
		List<String> list = new ArrayList<>(listen);
		Collections.sort(list);
		
		sb.append(list.size()).append("\n");
		
		for(String str : list) {
			sb.append(str).append("\n");
		}
		System.out.println(sb);
	}
}
