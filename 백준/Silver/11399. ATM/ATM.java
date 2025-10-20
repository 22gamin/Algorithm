import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] times = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int n = 0; n<N; n++) {
			times[n] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(times);

		int sum = 0;
		int answer = 0;
		for(int i = 0; i<N; i++) {
			sum += times[i];
			answer += sum;
		}
		System.out.println(answer);
	}

}
