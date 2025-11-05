package BOJ2475;

import java.util.Scanner;

public class BOJ2475E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = 0;
        for (int num : nums) {
            sum += num * num;
        }

        System.out.println(sum % 10);
        sc.close();
    }
}
