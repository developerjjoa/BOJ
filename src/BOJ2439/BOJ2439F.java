package BOJ2439;

import java.util.Scanner;

public class BOJ2439F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    System.out.printf("%" + N + "s\n", "*".repeat(i));
                }
            }
        }
        sc.close();
    }
}
