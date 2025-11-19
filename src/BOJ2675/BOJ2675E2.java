package BOJ2675;

import java.util.Scanner;

public class BOJ2675E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int R = sc.nextInt();
            String S = sc.next();

            StringBuilder sb = new StringBuilder();

            for (char c : S.toCharArray()) {
                sb.append(String.valueOf(c).repeat(R));
            }
            System.out.print(sb);
        }
    }
}
