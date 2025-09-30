import java.util.*;
import java.io.*;

public class Main {
	
	public static class Member implements Comparable<Member>{
		int age;
		String name;
		int order;
		
		public Member(int age, String name, int order) {
			
			this.age = age;
			this.name = name;
			this.order = order;
		}

		@Override
		public int compareTo(Member o) {
			if (this.age == o.age) {
				return this.order - o.order;
			}
			return this.age - o.age;
		}


	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		List<Member> list = new ArrayList<>();
		
		for(int i = 0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			list.add(new Member(Integer.parseInt(st.nextToken()),st.nextToken(),i));
		}
		//입력 끝
		
		Collections.sort(list);
		
		for(int i =0; i<N; i++) {
			sb.append(list.get(i).age).append(" ").append(list.get(i).name).append("\n");
		}
		System.out.println(sb);
	}


}
