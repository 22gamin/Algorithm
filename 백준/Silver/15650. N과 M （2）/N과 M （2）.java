import java.io.*;
import java.util.*;

public class Main {
	
	static int N, M;
	static boolean[] isSelected;
	static int[] answer;

	
	public static void perm(int start, int cnt) {
		
		if (cnt == M) {
			
			for(int num : answer) {
				System.out.print(num + " ");
			}
			System.out.println();
			return;
		}
		
		for (int i = start; i<N+1; i++) {
			if (!isSelected[i]) {
				isSelected[i] = true;
				answer[cnt] = i;
				
				perm(i,cnt+1);
				
				isSelected[i] = false;
				answer[cnt] = 0;
			}
		}
	}
		

    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        isSelected = new boolean[N+1];
        answer = new int[M];
        
        perm(1,0);
        
        
	}
    
}
