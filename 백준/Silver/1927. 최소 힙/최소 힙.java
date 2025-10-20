import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> a-b);
		
		for(int i = 0; i<N; i++) {
			int num = sc.nextInt();
			
			if(num == 0) {
				if(queue.isEmpty()) sb.append(0).append("\n");
				else sb.append(queue.poll()).append("\n");
			}
			else {
				queue.add(num);
			}
		}
		System.out.println(sb);

	}

}
