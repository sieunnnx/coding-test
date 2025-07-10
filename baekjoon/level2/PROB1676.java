package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PROB1676 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int[] zeroCnts = new int[501];

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        calZeroCnt();

        System.out.println(zeroCnts[N]);
    }

    public static void calZeroCnt() {
        for (int i = 1; i < 501; i++) {
            int x = i;
            while (x % 5 == 0) { // ここで５が何回含まれているか計算する。
                zeroCnts[i]++;
                x /= 5;
            }

            zeroCnts[i] += zeroCnts[i - 1]; // 前の値を足して累積和を求める。
        }
    }
}
