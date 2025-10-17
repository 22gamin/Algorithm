import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int mul = 6;
		int cnt = 2; //방 개수
		int num = 2;
		int numCnt = 1;
		
		if (N == 1) {
			System.out.println(1);
			return;
		}
		
		while (num != N+1) {

			if (numCnt == mul+1) {
				mul += 6;
				cnt++;
				numCnt = 1;
			}
			num++;
			numCnt++;
			
		}
		System.out.println(cnt);
	}

}
