package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB1259 {
    static final String TRUE = "yes";
    static final String FALSE = "no";
    static final String EOF = "0";

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static String sentence;

    public static void main(String[] args) throws IOException {
        while(true) {
            sentence = br.readLine();

            if (sentence.equals(EOF)) {
                System.out.println(sb.toString());
                return;

            } else {
                solve();
            }
        }
    }

    public static void solve() {
        int leftIdx = 0;
        int rightIdx = sentence.length() - 1;

        while(leftIdx <= rightIdx) {
            if (sentence.charAt(leftIdx) != sentence.charAt(rightIdx)) {
                sb.append(FALSE).append("\n");
                return;
            }

            leftIdx++;
            rightIdx--;
        }

        sb.append(TRUE).append("\n");
    }
}
