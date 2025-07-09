package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB2292 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        System.out.println(solve());
    }

    public static int solve() {
        int step = 0;
        int roomNum = 1;
        int d = 6;
        int finalNum = 1;

        while (true) {
            if (finalNum < N) {
                step++;
                roomNum++;
                finalNum += step * d;
            } else
                return roomNum;
        }
    }
}
