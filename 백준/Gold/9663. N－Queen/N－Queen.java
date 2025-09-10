import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int[] col;   // col[i] = i번째 행에 놓인 퀸의 열 위치
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        col = new int[N];
        backtrack(0);

        System.out.println(answer);
    }

    static void backtrack(int row) {
        if (row == N) {  // N개의 퀸을 전부 놓은 경우
            answer++;
            return;
        }

        for (int c = 0; c < N; c++) {
            col[row] = c;
            if (isSafe(row)) {
                backtrack(row + 1);
            }
        }
    }

    static boolean isSafe(int row) {
        for (int i = 0; i < row; i++) {
            // 같은 열에 위치하거나, 대각선에 위치한 경우
            if (col[i] == col[row] || Math.abs(row - i) == Math.abs(col[row] - col[i])) {
                return false;
            }
        }
        return true;
    }
}
