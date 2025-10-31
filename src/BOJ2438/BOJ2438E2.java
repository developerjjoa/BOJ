package BOJ2438;

import java.util.Scanner;

public class BOJ2438E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            sb.append("*");
            System.out.println(sb);
        }

        sc.close();
    }
}
