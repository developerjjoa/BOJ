package BOJ2439;

import java.util.Scanner;

public class BOJ2439E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            sb.setLength(0);

            //공백 출력
            for (int j = 1; j <= N - i; j++) {
                sb.append(" ");
            }

            //별 출력
            for (int k = 1; k <= i; k++) {
                sb.append("*");
            }
            System.out.println(sb);
        }
        sc.close();
    }
}
