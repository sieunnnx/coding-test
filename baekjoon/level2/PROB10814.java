package level2;

import java.io.*;
import java.util.*;

public class PROB10814 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N;
    static List<User> users = new ArrayList<>();

    static class User {
        int age;
        String name;
        int order;
    }

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            User user = new User();
            user.age = age;
            user.name = name;
            user.order = i;

            users.add(user);
        }

        sortArray();
        print();
    }

    public static void sortArray() {
        users.sort(((o1, o2) -> {
            if (o1.age == o2.age)
                return o1.order - o2.order;

            return o1.age - o2.age;
        }));
    }

    public static void print() {
        for (User user : users) {
            System.out.println(user.age + " " + user.name);
        }
    }
}
