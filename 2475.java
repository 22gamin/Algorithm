package baekjoon;
import java.util.Scanner;

public class ex2475_test {
	public static void main(String[] args) {
		int A=0,B=0,C=0,D=0,E=0,T=0;
		
		Scanner sc = new Scanner(System.in);
		
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		D=sc.nextInt();
		E=sc.nextInt();
		
		T=(A*A+B*B+C*C+D*D+E*E)% 10;
		
		System.out.println(T);
		
	}
}
