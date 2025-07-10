package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB1436 {
    static final String MUST_HAVE_VALUE = "666";

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        int result = makeMovieTitles();

        System.out.println(result);
    }

    public static int makeMovieTitles() {
        int currentNum = 666;
        int cnt = 0;

        while(true) {
            if (String.valueOf(currentNum).contains(MUST_HAVE_VALUE)) {
                cnt++;
            }

            if (cnt == N) {
                return currentNum;
            }

            currentNum++;
        }
    }
}
