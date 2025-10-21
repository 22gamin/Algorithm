import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		Set<Integer> check = new HashSet<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<N; i++) {
			check.add(Integer.parseInt(st.nextToken()));
		}
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int m = 0; m<M; m++) {
			if (check.contains(Integer.parseInt(st.nextToken()))) sb.append(1).append("\n");
			else sb.append(0).append("\n");
		}
		System.out.println(sb);
	}

}
