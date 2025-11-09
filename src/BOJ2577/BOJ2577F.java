package BOJ2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2577F {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int multiple = 1;
        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(br.readLine());
            multiple *= num;
        }
        String[] split = String.valueOf(multiple).split("");
        for (String s : split) {
            int arrNum = Integer.parseInt(s);
            arr[arrNum] += 1;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
