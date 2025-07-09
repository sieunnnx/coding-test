package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB1546 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N;
    static int M = 0;
    static int[] scores;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        scores = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            scores[i] = Integer.parseInt(st.nextToken());

            if (scores[i] > M){
                M = scores[i];
            }
        }

        solve();
    }

    public static void solve() {
        double avg = 0;
        double sum = 0;

        for (int score : scores) {
            sum += (double) score / M * 100;
        }

        avg = sum / N;
        System.out.println(avg);
    }
}
