import java.util.*;
import java.io.*;

public class NoSeparation {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		m = m - (n - 1);
		
		for (int i = 2; i <= n; i++) {
			System.out.println("1 " + i);
		}
		outerloop:
		for (int i = 2; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				if (m == 0) {
					break outerloop;
				}
				System.out.println(i + " " + j);
				m--;
			}
		}

	}

}
