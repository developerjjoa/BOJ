package BOJ2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2562BF {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxValue = -1;
        int maxIndex = -1;

        for (int i = 1; i <= 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > maxValue) {
                maxValue = num;
                maxIndex = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(maxValue).append('\n');
        sb.append(maxIndex);

        System.out.println(sb);
    }
}
