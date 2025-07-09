package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB2775 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static int T;
    static int k;
    static int n;
    static int[][] houses = new int[15][15];

    public static void main(String[] args) throws IOException {
        calHowManyLive();

        T =  Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());

            sb.append(houses[k][n]).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void calHowManyLive() {
        // 0階
        for (int i = 1; i < 15; i++) {
            houses[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                for (int k = 0; k <= j; k++) {
                    houses[i][j] += houses[i - 1][k];
                }
            }
        }
    }
}
