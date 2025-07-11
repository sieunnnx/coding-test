package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB2839 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int cnt;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        solve();
        System.out.println(cnt);
    }

    public static void solve() {
        while (N >= 0) {
            if (N % 5 == 0) {
                cnt += N / 5;
                break;
            }
            N -= 3;
            cnt++;
        }
        if (N < 0) cnt = -1;
    }
}
