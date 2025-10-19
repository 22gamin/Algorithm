import javax.xml.transform.stream.StreamSource;
import java.util.*;
import java.io.*;

public class Main {
    static int N,M,map[][],answer[][];
    static Queue<int[]> queue = new LinkedList<>();
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        answer = new int[N][M];

        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<M; j++){
                int num = Integer.parseInt(st.nextToken());
                map[i][j] = num;
                answer[i][j] = num;
                if(map[i][j] == 1) queue.add(new int[]{i,j,0});
            }
        }
        // 입력 끝

        while(!queue.isEmpty()){
            int[] curr = queue.poll();

            for(int dic = 0; dic < 4; dic++){
                int x = curr[0] + dx[dic];
                int y = curr[1] + dy[dic];

                if(x>=0 && y>=0 && x<N && y<M && map[x][y] == 0 && answer[x][y] == 0){
                    answer[x][y] = curr[2]+1;
                    queue.add(new int[]{x,y,curr[2]+1});
                }
            }
        }
        int max = 1;
        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                if(answer[i][j] == 0){
                    System.out.println(-1);
                    return;
                }
                max = Math.max(answer[i][j], max);
            }
        }
        if (max == 1){
            System.out.println(0);
        } else{
            System.out.println(max);
        }

    }
}
