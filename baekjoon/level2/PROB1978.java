package level2;

import java.io.*;
import java.util.*;

public class PROB1978 {
    static final int TRUE = 1;
    static final int FALSE = 0;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N;
    static int primeCnt;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(st.nextToken());
            int answer = isPrimeNumber(input);

            if (answer == TRUE) primeCnt++;
        }

        System.out.println(primeCnt);
    }

    public static int isPrimeNumber(int input) {
        int count = 0;
        if (input == 1) return FALSE;

        for (int i = 2; i < input; i++) {
            if (input % i == 0) count++;
            if (count > 0) return FALSE;
        }

        return TRUE;
    }
}
