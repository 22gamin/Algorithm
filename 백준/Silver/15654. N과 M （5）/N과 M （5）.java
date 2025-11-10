import java.util.*;
import java.io.*;

public class Main {
	static int N, M,nums[];
	static boolean visited[];
	static List<List<Integer>> answer = new ArrayList<>();
	
	static void find(List<Integer> list) {
		if (list.size() == M) {
			answer.add(new ArrayList<>(list));
			return;
		}
		
		for(int i = 0; i<N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				list.add(nums[i]);
				find(list);
				
				list.remove(list.size()-1);
				visited[i] = false;
			}
		}
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		nums = new int[N];
		visited = new boolean[N];
		
		st= new StringTokenizer(br.readLine());
		
		for(int n = 0; n<N; n++) {
			nums[n] = Integer.parseInt(st.nextToken());
		} //입력 끝
		
		find(new ArrayList<>());
		
		Collections.sort(answer, (listA, listB) -> {
			for(int i = 0; i<M; i++) {
				int comp = listA.get(i).compareTo(listB.get(i));
				
				if(comp != 0) {
					return comp;
				}
			}
			return 0;
		});
		StringBuilder sb = new StringBuilder();
		
		for(List<Integer> li : answer) {
			for(int num : li) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		
	}

}
