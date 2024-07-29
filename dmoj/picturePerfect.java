import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class picturePerfect {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = -1;
		
		while (true) {
			input = Integer.parseInt(br.readLine());
			if (input == 0) {
				break;
			}
			for (int i = (int) Math.sqrt(input);; i--) {
				if ((int) input / i == input * 1.0 / i) {
					int perimeter = 2 * i + 2 * (input / i);
					System.out.println("Minimum perimeter is " + perimeter + " with dimensions " + i + " x " + (input / i));
					break;
				}
			}
		}

	}

}
