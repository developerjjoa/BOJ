package BOJ15740;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ15740BF {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        BigInteger A = new BigInteger(split[0]);
        BigInteger B = new BigInteger(split[1]);

        System.out.println(A.add(B));
    }
}
