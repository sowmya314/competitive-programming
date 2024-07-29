import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class trident {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()); // height of lines
		int s = Integer.parseInt(br.readLine()); // spacing between lines
		int h = Integer.parseInt(br.readLine()); // length of handle
		
		for (int i = 0; i < t; i++) {
			System.out.println("*" + " ".repeat(s) + "*" + " ".repeat(s) + "*");
		}
		
		System.out.println("*".repeat(3 + 2 * s));
		
		for (int i = 0; i < h; i++) {
			System.out.println(" ".repeat(s + 1) + "*");
		}
	}
}
