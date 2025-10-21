import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		Map<Integer,Integer> cnt = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int n =0; n<N; n++) {
			int num = Integer.parseInt(st.nextToken());
			
			cnt.put(num, cnt.getOrDefault(num, 0)+1);
		}
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<M; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (cnt.containsKey(num)) {
				sb.append(cnt.get(num)).append(" ");
			} else {
				sb.append(0).append(" ");
			}
		}
		System.out.println(sb);
	}

}
