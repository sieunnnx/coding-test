package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB2231 {
    static final int TRUE = 1;
    static final int FALSE = 0;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int[] numbers;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        numbers = new int[N];

        for (int i = 1; i < N; i++) {
            numbers[i] = i;
        }

        System.out.println(solve());
    }

    public static int solve() {
        int minVal = 0;

        for (int i = N - 1; i > 0; i--) {
            int result = isSumSameWithN(i);
            if (result == TRUE) minVal = i;
        }

        return minVal;
    }

    public static int isSumSameWithN(int number) {
        int sum = 0;
        int currNum = number;

        while(true) {
            sum += currNum % 10;
            currNum /= 10;

            if (currNum == 0) break;
        }

        sum += number;

        if (sum == N) return TRUE;
        else return FALSE;
    }
}
