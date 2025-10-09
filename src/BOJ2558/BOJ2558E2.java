package BOJ2558;

import java.util.Scanner;

public class BOJ2558E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(A + B);
        }
        scanner.close();
    }
}
