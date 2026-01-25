import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[n];

        for(int i = 0; i<n; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());

        Arrays.sort(nums);

        int start = 0;
        int end = n-1;
        int cnt = 0;

        while(start < end){
            int sum = nums[start] + nums[end];

            if(sum == x){
                cnt++;
                start++;
                end--;
            } else if(sum < x){
                start++;
            } else{
                end--;
            }
        }
        System.out.println(cnt);

    }
}
