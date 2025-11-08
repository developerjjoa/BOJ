package BOJ2562;

import java.util.Scanner;

public class BOJ2562E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxValue = -1;
        int maxIndex = -1;

        for (int i = 1; i <= 9; i++) {
            int num = sc.nextInt();
            if (num > maxValue) {
                maxValue = num;
                maxIndex = i;
            }
        }
        System.out.println(maxValue);
        System.out.println(maxIndex);
    }
}
