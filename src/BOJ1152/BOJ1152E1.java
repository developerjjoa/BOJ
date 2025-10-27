package BOJ1152;

import java.util.Scanner;

public class BOJ1152E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = input.split(" +");
            System.out.println(words.length);
        }
        sc.close();
    }
}
