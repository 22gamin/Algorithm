import java.io.*;
import java.util.*;

public class Main {
	
	static int N;
	static int M;
	static List<int[]> arr = new ArrayList<>();
	static int[] in;
	static boolean[] isSelected;
	
	static void perm(int depths) {
		
		if (depths == M+1) {
			
			arr.add(in.clone());
			return ;
		}
		
		for(int i = 1; i<N+1; i++) {
			
			if (!isSelected[i]) {
				isSelected[i] = true;
				in[depths] = i;
				perm(depths+1);
				isSelected[i] = false;

			}
		}
	}
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        
        
        isSelected = new boolean[N+1];
        in = new int[M+1];
		
        perm(1);
        
        for(int[] a : arr) {
        	for(int k = 1; k<M+1; k++) {
        		System.out.print(a[k]+" ");
        	}
        	System.out.println();
        }
        
	}
    
}
