package BOJ2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2577E1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = A * B * C;
        String s = String.valueOf(result);

        int[] count = new int[10];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - '0']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int c : count) {
            sb.append(c).append('\n');
        }

        System.out.println(sb);
    }
}
