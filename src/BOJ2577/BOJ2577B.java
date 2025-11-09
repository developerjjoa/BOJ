package BOJ2577;

import java.util.Scanner;

public class BOJ2577B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int result = A * B * C;
        String s = String.valueOf(result);

        int[] count = new int[10];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int digit = ch - '0';
            count[digit]++;
        }

        for (int c : count) {
            System.out.println(c);
        }
    }
}
