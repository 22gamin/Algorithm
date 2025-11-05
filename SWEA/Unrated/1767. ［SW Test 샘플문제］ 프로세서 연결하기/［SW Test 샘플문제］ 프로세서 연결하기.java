import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution { // SWEA 제출 시 클래스 이름은 Solution

    static int N;
    static int[][] map;
    static List<int[]> coreList;
    static int maxCoreCount;
    static int minWireLength;
    static int totalCoreCount; // 가장자리가 아닌 코어의 총 개수
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());

        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine().trim());
            map = new int[N][N];
            coreList = new ArrayList<>();
            maxCoreCount = 0;
            minWireLength = Integer.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine().trim());
                for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                    if (map[i][j] == 1) {
                        if (i > 0 && i < N - 1 && j > 0 && j < N - 1) {
                            coreList.add(new int[]{i, j});
                        }
                    }
                }
            }
            totalCoreCount = coreList.size();
            findPath(0, 0, 0);
            
            sb.append("#").append(tc).append(" ").append(minWireLength).append("\n");
        }
        System.out.print(sb.toString());
    }

    static void findPath(int coreIndex, int connectedCores, int totalWireLength) {
        
        // 앞으로 남은 코어를 전부 연결해도, 기존에 찾은 최대 코어 수보다 적으면 더 볼 필요 없음
        if (connectedCores + (totalCoreCount - coreIndex) < maxCoreCount) {
            return;
        }

        // 기저 조건: 모든 코어에 대한 선택이 완료되었을 때
        if (coreIndex == totalCoreCount) {
            if (connectedCores > maxCoreCount) {
                maxCoreCount = connectedCores;
                minWireLength = totalWireLength;
            } else if (connectedCores == maxCoreCount) {
                minWireLength = Math.min(minWireLength, totalWireLength);
            }
            return;
        }

        int r = coreList.get(coreIndex)[0];
        int c = coreList.get(coreIndex)[1];

        // 4방향 연결 시도
        for (int d = 0; d < 4; d++) {
            if (isConnectable(r, c, d)) {
                int wireLength = placeWire(r, c, d, 2);
                findPath(coreIndex + 1, connectedCores + 1, totalWireLength + wireLength);
                placeWire(r, c, d, 0); // 백트래킹
            }
        }

        // 현재 코어를 연결하지 않는 경우
        findPath(coreIndex + 1, connectedCores, totalWireLength);
    }

    static boolean isConnectable(int r, int c, int d) {
        int nr = r;
        int nc = c;
        while (true) {
            nr += dr[d];
            nc += dc[d];
            if (nr < 0 || nr >= N || nc < 0 || nc >= N) return true;
            if (map[nr][nc] != 0) return false;
        }
    }

    static int placeWire(int r, int c, int d, int cellType) {
        int length = 0;
        int nr = r;
        int nc = c;
        while (true) {
            nr += dr[d];
            nc += dc[d];
            if (nr < 0 || nr >= N || nc < 0 || nc >= N) break;
            map[nr][nc] = cellType;
            length++;
        }
        return length;
    }
}