package BOJ2439;

import java.util.Scanner;

public class BOJ2439B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            String stars = "*".repeat(i);
            System.out.println(String.format("%" + N + "s", stars));
        }

        sc.close();
    }
}
