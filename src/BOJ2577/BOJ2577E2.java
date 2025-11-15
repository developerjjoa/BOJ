package BOJ2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2577E2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = A * B * C;
        int[] count = new int[10];

        while (result > 0) {
            count[result % 10]++; //마지막 자리 숫자 추출
            result /= 10;
        }

        for (int c : count) {
            System.out.println(c);
        }
    }
}
