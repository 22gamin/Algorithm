import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int tc = 0; tc<T; tc++){
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(),"[], ");

            Deque<Integer> deque = new ArrayDeque<>();

            for(int i = 0; i<n; i++){
                deque.addLast(Integer.parseInt(st.nextToken()));
            } //입력 끝

            int re = 1; // 1 : 정방향, -1: 역방향

            boolean error = false;

            for(int j = 0; j<p.length(); j++){
                if (p.charAt(j) == 'R'){
                    re *= (-1);
                }
                else if (!error) {
                    if (deque.isEmpty()) {
                        sb.append("error").append("\n");
                        error = true;
                    }

                    else if (re == 1){
                        deque.removeFirst();
                    }

                    else {
                        deque.removeLast();
                    }
                }
            }


            if (error){
                continue;
            }

            sb.append("[");

            while(!deque.isEmpty()){

                if (deque.size() == 1){
                    sb.append(deque.poll());
                }

                else if (re == 1) { //정방향
                    sb.append(deque.pollFirst()).append(",");
                } else {
                    sb.append(deque.pollLast()).append(",");
                }
            }
            sb.append("]").append("\n");

        }
        System.out.println(sb);
    }
}
