import java.util.*;
import java.io.*;

public class Solution {
    static char[] num;
    static int cnt,max;
    static HashSet<String> visited;

    static void find(char[] number, int count){
        String key = new String(number) + count;

        if (visited.contains(key)) return;
        visited.add(key);

        if (count == cnt){
            int value = Integer.parseInt(new String(number));
            if (value > max) max = value;
            return;
        }

        for(int i = 0; i < number.length; i++){
            for(int j = i+1; j < number.length; j++){
                if (i != j) {
                    swap(number, i, j);
                    find(number, count+1);
                    swap(number, i, j);
                }
            }
        }
    }

    static void swap(char[] number, int n1, int n2){
        char swap = number[n1];
        number[n1] = number[n2];
        number[n2] = swap;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc<T+1; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append('#').append(tc).append(" ");

            num = st.nextToken().toCharArray();
            cnt = Integer.parseInt(st.nextToken());

            max = 0;
            visited = new HashSet<>();
            find(num, 0);
            sb.append(max).append("\n");
        }
        System.out.print(sb);
    }
}
