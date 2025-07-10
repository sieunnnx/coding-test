package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PROB1920 {
    static final int CONTAIN = 1;
    static final int NOT_CONTAIN = 0;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N, M;
    static Set<Integer> nNumbers = new HashSet<>();
    static List<Integer> mNumbers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(st.nextToken());
            nNumbers.add(input);
        }

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int input = Integer.parseInt(st.nextToken());
            mNumbers.add(input);
        }

        isContainNumber();
    }

    public static void isContainNumber() {
        for (int mNumber : mNumbers) {
            if(nNumbers.contains(mNumber)) {
                System.out.println(CONTAIN);
            } else  {
                System.out.println(NOT_CONTAIN);
            }
        }
    }
}
