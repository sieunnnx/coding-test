package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB7568 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N;
    static int x; // 体重
    static int y; // 身長
    static int[][] students;
    static int[] ranks;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        students = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            students[i][0] = x;
            students[i][1] = y;
        }

        setRanks();
        print();
    }

    public static void setRanks() {
        ranks = new int[N];

        for (int i = 0; i < N; i++) {
            int currX = students[i][0];
            int currY = students[i][1];
            int rank = 1;

            for (int j = 0; j < N; j++) {
                if (i == j) continue;

                int x = students[j][0];
                int y = students[j][1];

                if (currX < x && currY < y) {
                    rank++;
                }
            }

            ranks[i] = rank;
        }
    }

    public static void print() {
        for (int rank : ranks) {
            System.out.print(rank + " ");
        }
    }
}
