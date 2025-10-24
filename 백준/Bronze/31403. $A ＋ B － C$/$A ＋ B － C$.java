import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int num = Integer.parseInt(String.valueOf(A) + String.valueOf(B));
		
		System.out.println(A+B-C);
		System.out.println(num - C);
	}

}
