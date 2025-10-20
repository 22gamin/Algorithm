import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Map<String,Integer> dic = new HashMap<>();
		String[] seq = new String[N+1];
		
		for(int n = 1; n<N+1; n++) {
			String str = br.readLine();
			dic.put(str,n);
			seq[n] = str;
		}
		
		for(int m = 0; m<M; m++) {
			String str = br.readLine();
			
			if(str.charAt(0)>=65) {
				sb.append(dic.get(str)).append("\n");
			}
			else {
				sb.append(seq[Integer.parseInt(str)]).append("\n");
			}
		}
		System.out.println(sb);
	}

}
