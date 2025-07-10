package level2;

import java.io.*;
import java.util.*;

public class PROB1650 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N;
    static int x;
    static int y;
    static int[][] coordinates;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        coordinates = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            coordinates[i][0] = x;
            coordinates[i][1] = y;
        }

        sortArray();
        print();
    }

    public static void sortArray() {
        coordinates = Arrays.stream(coordinates)
                .sorted(((o1, o2) -> {
                    if (o1[0] == o2[0]) {
                        return o1[1] - o2[1];
                    }
                    return o1[0] - o2[0];
                }))
                .toArray(int[][]::new);
    }

    public static void print() {
        for (int[] coordinate : coordinates) {
            System.out.println(coordinate[0] + " " + coordinate[1]);
        }
    }
}
