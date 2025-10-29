package BOJ1330;

import java.util.Scanner;

public class BOJ1330E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A > B ? ">" : (A < B ? "<" : "=="));
        sc.close();
    }
}
