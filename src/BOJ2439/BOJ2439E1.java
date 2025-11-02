package BOJ2439;

import java.util.Scanner;

public class BOJ2439E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            //공백 출력
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            //별 출력
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
