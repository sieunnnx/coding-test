package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB11050 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N;
    static int K;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int answer = factorial(N) / (factorial(K) * factorial(N - K));

        System.out.println(answer);
    }

    public static int factorial(int n) {
        if (n == 0) return 1;

        return n * factorial(n - 1);
    }
}
