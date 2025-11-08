package BOJ2562;

import java.util.Scanner;

public class BOJ2562E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }

        int maxValue = arr[0];
        int maxIndex = 1;

        for (int i = 1; i < 9; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i + 1;
            }
        }

        System.out.println(maxValue);
        System.out.println(maxIndex);
    }
}
