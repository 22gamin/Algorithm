import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		
		for(int n = 0; n<N; n++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(n==0) {
				list.add(num);
				continue;
			}
			
			if(num > list.get(list.size()-1)) {
				list.add(num);
			} else {
				int idx = Collections.binarySearch(list, num);
				
				if(idx<0) {
					idx = -(idx+1);
				}
				
				list.set(idx, num);
			}
		}
		
//		sb.append(list.size()).append("\n");
//		for(int num : list) {
//			sb.append(num).append(" ");
//		}
//		System.out.println(sb);
		System.out.println(list.size());
	}

}
