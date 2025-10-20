import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int M = Integer.parseInt(br.readLine());
		
		
		
		Set<Integer> S = new HashSet<>();
		
		for(int m = 0; m<M; m++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String action = st.nextToken();
			
			if(action.equals("all")) {
				S.clear();
				S = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
			}
			else if (action.equals("empty")){
				S.clear();
			}
			
			else {
				int x = Integer.parseInt(st.nextToken());
				
				if(action.equals("add")) {
					S.add(x);
				}
				else if(action.equals("remove")) {
					S.remove(x);
				}
				else if(action.equals("check")) {
					if (S.contains(x)) sb.append(1).append("\n");
					else sb.append(0).append("\n");
				}
				else if(action.equals("toggle")) {
					if (S.contains(x)) S.remove(x);
					else S.add(x);
				}
			}
			
			
		}
		System.out.println(sb);
	}

}
