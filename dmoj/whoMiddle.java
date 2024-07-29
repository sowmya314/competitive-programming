import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class whoMiddle {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());
		
		if ((num1 <= num2 && num2 <= num3) || (num3 <= num2 && num2 <= num1)) {
			System.out.println(num2);
		} else if ((num2 <= num3 && num3 <= num1) || (num1 <= num3 && num3 <= num2)) {
			System.out.println(num3);
		} else {
			System.out.println(num1);
		}

	}

}
