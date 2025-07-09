package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2869 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int V;
    static int A;
    static int B;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        A =Integer.parseInt(st.nextToken());
        B =Integer.parseInt(st.nextToken());
        V =Integer.parseInt(st.nextToken());

        solve();
    }

    public static void solve() {
        int days = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0) {
            days++;
        }

        System.out.println(days);
    }
}
