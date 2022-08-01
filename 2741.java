package baekjoon;
import java.util.Scanner;

public class ex2741_N {
	public static void main(String[] args) {
		
		int N=1;
		Scanner sc = new Scanner(System.in);
		
		N=sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			System.out.println(i);
		}
		sc.close();
	}
}
