package BOJ2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ2577E3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = A * B * C;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, 0);
        }

        while (result > 0) {
            int digit = result % 10;
            map.put(digit, map.get(digit) + 1);
            result /= 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(map.get(i));
        }
    }
}
