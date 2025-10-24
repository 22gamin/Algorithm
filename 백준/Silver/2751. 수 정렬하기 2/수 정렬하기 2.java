import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a-b);
		
		for(int i =0; i<N; i++) {
			pq.add(sc.nextInt());
		}
		
		for(int i = 0; i<N; i++) {
			sb.append(pq.poll()).append("\n");
		}
		System.out.println(sb);
	}

}
