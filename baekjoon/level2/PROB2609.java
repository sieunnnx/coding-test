package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2609 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int a, b;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        a = Math.max(num1, num2);
        b = Math.min(num1, num2);

        int GCD = findGCD(a, b);
        int LCM = (a * b) / GCD;

        System.out.println(GCD);
        System.out.println(LCM);
    }

    public static int findGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return findGCD(b, a % b);
    }
}
