package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB15829 {
    static final int MOD = 1234567891;
    static final int R = 31;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int L;
    static String sentence;

    public static void main(String[] args) throws IOException {
        L = Integer.parseInt(br.readLine());
        sentence = br.readLine();

        solve();
    }

    public static void solve() {
        long sum = 0;
        int a = 0;
        long r = 1;

        for (int i = 0; i < L; i++) {
            a = sentence.charAt(i) - 'a' + 1;

            sum += a * r % MOD;
            r = r * R % MOD;
        }

        sum %= MOD;
        System.out.println(sum);
    }
}
