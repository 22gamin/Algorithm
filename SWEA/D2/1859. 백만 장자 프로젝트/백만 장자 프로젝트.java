
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Solution
{
	public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringBuilder sb = new StringBuilder();
    	
    	int T = Integer.parseInt(br.readLine());

    	for(int i =1; i<T+1; i++) {
    		int N = Integer.parseInt(br.readLine());
    		
    		int[] arr = new int[N];

    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for(int j = 0; j <N; j++) {
    			arr[j] = Integer.parseInt(st.nextToken());
    		}
    		
    		//-- 입력 끝
    		
    		// 뒤에서부터 탐색
    		// max값을 가지고 있다가 새로운 max값이 등장하면 이전거 다 팔기
    		int max = 0;
    		long sum = 0;
    		
    		for(int j = arr.length-1; j>-1; j--) {

    			if (arr[j] > max) {

    				max = arr[j];
    				continue;
    				
    			}
    			
    			sum += (max-arr[j]); 
    			
    		}
    		sb.append("#").append(i).append(" ").append(sum).append("\n");
//    		System.out.println("#" + i + " " + value);
    		

    	}
    	System.out.println(sb.toString());
	}
    
}
