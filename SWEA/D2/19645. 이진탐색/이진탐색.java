import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int BinarySearch(int start, int end, int find){

        int mid;
        int count = 0;

        while (start <= end){
            mid = (start+end)/2;
            count++;

            if (find == mid) return count;
            else if(mid > find){
                end = mid;
            }
            else {
                start = mid;
            }

        }
        return -1;

    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());

        for(int t = 1; t<tc+1; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append('#').append(t).append(" ");
            int P = Integer.parseInt(st.nextToken());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int ACount = BinarySearch(1,P,A);
            int BCount = BinarySearch(1,P,B);

            if (ACount > BCount) sb.append('B').append("\n");
            else if (ACount < BCount) sb.append('A').append("\n");
            else sb.append(0).append("\n");
        }
        System.out.println(sb);
    }

}
