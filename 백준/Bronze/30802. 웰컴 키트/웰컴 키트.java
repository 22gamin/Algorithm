import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] tshirts = new int[6];
		

		for(int i = 0 ;i<6; i++) {
			tshirts[i] = Integer.parseInt(st.nextToken());
		}

		
		st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		for(int num : tshirts) {
			if (num % T == 0) {
				cnt += num/T;
			} 
			else {
				cnt += (num/T+1);
			}
		}
		
		System.out.println(cnt);
		
		System.out.println(N/P + " " + N%P);
		
		
	}

}
