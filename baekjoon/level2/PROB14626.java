package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB14626 {
    static final String STAR = "*";
    static final int TARGET_NUM = -1;
    static final int WEIGHT_3 = 3;
    static final int WEIGHT_1 = 1;
    static final int MOD = 10;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String[] input;
    static int[] isbnNumber;
    static int starWeight;
    static int answer;

    public static void main(String[] args) throws IOException {
        input = br.readLine().split("");

        isbnNumber = new int[input.length];
        for (int i = 0; i < 13; i++) {
            if (!input[i].equals(STAR)) {
                isbnNumber[i] = Integer.parseInt(input[i]);
            }
            else {
                isbnNumber[i] = TARGET_NUM;

                if (i % 2 == 0)
                    starWeight = WEIGHT_1;
                else
                    starWeight = WEIGHT_3;
            }
        }

        int answer = solve();
        System.out.println(answer);
    }

    public static int solve() {
        int sum = 0;
        int starIdx = 0;

        for (int i = 0; i < 13; i++) {
            int current = isbnNumber[i];

            if (current != TARGET_NUM) {
                if (i % 2 == 0)
                    sum += current * WEIGHT_1;
                else
                    sum += current * WEIGHT_3;
            } else {
                starIdx = i;
            }
        }

        for (int i = 0; i < 10; i++) {
            sum += starWeight * i;

            if (sum % 10 == 0)
                return i;
            else
                sum -= starWeight * i;
        }

        return -1;
    }
}
