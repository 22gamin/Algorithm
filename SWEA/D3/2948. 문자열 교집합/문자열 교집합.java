import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc<T+1; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Set<String> a = new HashSet<>();
            Set<String> b = new HashSet<>();

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i<N; i++){
                String str = st.nextToken();
                a.add(str);
            }

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i<M; i++){
                String str = st.nextToken();
                b.add(str);
            }
            
            int cnt = 0;
            for(String str : a){
                if (b.contains(str)) cnt++;
            }
            sb.append('#').append(tc).append(" ").append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}
