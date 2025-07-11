package level2;

import java.io.*;
import java.util.*;

public class PROB4949 {
    static final String YES = "yes";
    static final String NO = "no";
    static final String EOF = ".";

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static Stack<String> brackets;

    public static void main(String[] args) throws IOException {
        while (true) {
            String input = br.readLine();

            if (input.equals(EOF)) break;

            String result = isBalancedSentence(input);
            sb.append(result).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static String isBalancedSentence(String input) {
        String[] inputArr = input.split("");
        brackets = new  Stack<>();

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i].equals("(") || inputArr[i].equals("[")) {
                brackets.push(inputArr[i]);

            } else if (inputArr[i].equals(")")){
                if (!brackets.isEmpty() && brackets.peek().equals("(")) {
                    brackets.pop();
                } else {
                    return NO;
                }

            } else if (inputArr[i].equals("]")) {
                if (!brackets.isEmpty() && brackets.peek().equals("[")) {
                    brackets.pop();
                } else {
                    return NO;
                }
            }
        }

        if (brackets.isEmpty())
            return YES;
        else
            return NO;
    }
}
