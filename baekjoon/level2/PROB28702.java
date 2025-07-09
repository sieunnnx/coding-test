package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PROB28702 {
    static final String FIZZ = "Fizz";
    static final String BUZZ = "Buzz";
    static final String FIZZBUZZ = "FizzBuzz";

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static Map<Integer, String> maps = new HashMap<>();

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 3; i++) {
            maps.put(i, br.readLine());
        }

        solve();
    }

    public static void solve() {
        String answer = "";

        for (int i = 0; i < 3; i++) {
            String currValue = maps.get(i);

            if (!currValue.equals(FIZZBUZZ) && !currValue.equals(BUZZ) && !currValue.equals(FIZZ)) {
                int num = (3 - i) + Integer.parseInt(currValue);
                answer = validateNumber(num);
            };
        }

        System.out.println(answer);
    }

    public static String validateNumber(int num) {
        if (num % 3 == 0 && num % 5 == 0)
            return FIZZBUZZ;
        else if (num % 3 == 0 && num % 5 != 0)
            return FIZZ;
        else if (num % 3 != 0 && num % 5 == 0)
            return BUZZ;
        else
            return String.valueOf(num);
    }
}
