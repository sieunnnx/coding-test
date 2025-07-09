package level2;

import java.io.*;
import java.util.*;

public class PROB30802 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int N;
    static int T;
    static int P;
    static int bundleOfShirts = 0;
    static int bundleOfPens = 0;
    static int penNum = 0;

    static int[] tShirts = new int[6];

    public static void main(String args[]) throws IOException {
        N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            int input = Integer.parseInt(st.nextToken());

            if (input == 0) input = -1;
            tShirts[i] = input;
        }

        st = new StringTokenizer(br.readLine());
        T = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        calBundleOfShirts();
        calBundleOfPens();

        System.out.println(sb.toString());
    }

    public static void calBundleOfShirts() {
        for (int i = 0; i < tShirts.length; i++) {
            if (tShirts[i] != -1) {
                bundleOfShirts += tShirts[i]/T;

                if (tShirts[i]%T != 0)
                    bundleOfShirts ++;
            }
        }

        sb.append(bundleOfShirts).append("\n");
    }

    public static void calBundleOfPens() {
        bundleOfPens = N / P;
        penNum = N % P;

        sb.append(bundleOfPens).append(" ");
        sb.append(penNum).append("\n");
    }
}
