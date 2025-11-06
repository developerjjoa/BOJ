package BOJ2475;

import java.util.Scanner;
import java.util.stream.IntStream;

public class BOJ2475E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = IntStream.range(0, 5)
                .map(i -> sc.nextInt())
                .map(n -> n * n)
                .sum() % 10;
        System.out.println(result);
        sc.close();
    }
}
