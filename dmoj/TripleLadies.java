import java.io.*;
import java.util.*;

public class TripleLadies {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            k += 8 - k % 10;
            while (true) {
                if (Math.pow(k, 3) % 1000 == 888) {
                    System.out.println(k);
                    break;
                }
                k++;
            }
        }
    }
}
