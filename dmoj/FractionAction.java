import java.io.*;
import java.lang.Math;

public class FractionAction {
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numerator = Integer.parseInt(br.readLine());
		int denominator = Integer.parseInt(br.readLine());
		
		int divisor = gcd(numerator, denominator);
		numerator /= divisor;
		denominator /= divisor;
		if (denominator == 1) {
			System.out.println(numerator);
		} else if (numerator == 0) {
			System.out.println(0);
		} else {
			if (numerator < denominator) {
				System.out.println(numerator + "/" + denominator);
			} else {
				System.out.println(numerator / denominator + " " + numerator % denominator + "/" + denominator);
			}
		}

	}

}
