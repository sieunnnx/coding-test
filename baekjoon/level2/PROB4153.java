package level2;

import java.io.*;
import java.util.*;

public class PROB4153 {
    static final String RIGHT = "right";
    static final String WRONG = "wrong";

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static double[] lengths;
    static int maxNumIdx;

    public static void main(String[] args) throws IOException {
        while(true) {
            st = new StringTokenizer(br.readLine(), " ");
            lengths = new double[3];
            maxNumIdx = 0;

            for (int i = 0; i < 3; i++) {
                double input = Double.parseDouble(st.nextToken());

                if (input == 0) {
                    System.out.println(sb.toString());
                    return;

                } else
                    lengths[i] = input;
            }

            isRightTrangle();
        }
    }

    public static void findMaxLength() {
        for (int i = 1; i < 3; i++) {
            if (lengths[i] > lengths[maxNumIdx]) {
                maxNumIdx = i;
            }
        }
    }

    public static void isRightTrangle() {
        findMaxLength();

        double sum = 0;
        double powC = Math.pow(lengths[maxNumIdx], 2);

        for (int i = 0; i < 3; i++) {
            if (i != maxNumIdx)
                sum += Math.pow(lengths[i], 2);
        }

        if (powC == sum)
            sb.append(RIGHT).append("\n");
        else
            sb.append(WRONG).append("\n");
    }
}
