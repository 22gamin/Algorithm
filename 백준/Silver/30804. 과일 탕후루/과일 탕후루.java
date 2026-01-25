import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        } //입력 완

        int[] fruit = new int[10];
        int start = 0;
        int end = 0;
        int kind = 0;
        int cnt = 0;

        while(start < N){
            int startFruit = arr[start];

            if (fruit[startFruit] == 0){
                kind++;
            }
            fruit[startFruit]++;
            start++;

            while(kind > 2){
                int endFruit = arr[end];
                fruit[endFruit]--;

                if(fruit[endFruit] == 0){
                    kind--;
                }
                end++;
            }

            cnt = Math.max(cnt, start-end);
        }
        System.out.println(cnt);
    }
}
