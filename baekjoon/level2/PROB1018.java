package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB1018 {
    static final int WHITE = 0;
    static final int BLACK = 1;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int M, N;
    static int[][] board;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                if (input[j].equals("W")) board[i][j] = WHITE;
                else board[i][j] = BLACK;
            }
        }

        int result = findMinCnt();
        System.out.println(result);
    }

    public static int findMinCnt() {
        int minCnt = Integer.MAX_VALUE;

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                int cntWhiteStart = 0;
                int cntBlackStart = 0;

                for (int l = i; l < i + 8; l++) {
                    for (int k = j; k < j + 8; k++) {
                        int expected = ((l + k) % 2 == 0) ? WHITE : BLACK;
                        if (board[l][k] != expected) cntWhiteStart++;
                        else cntBlackStart++;
                    }
                }

                minCnt = Math.min(minCnt, Math.min(cntWhiteStart, cntBlackStart));
            }
        }

        return minCnt;
    }
}
