package BOJ2438;

import java.util.Scanner;

public class BOJ2438B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("*".repeat(i));
        }

        sc.close();
    }
}
