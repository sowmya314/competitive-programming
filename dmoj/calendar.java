import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class calendar {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int weekday = Integer.parseInt(input[0]);
		int days = Integer.parseInt(input[1]);
		
		System.out.println("Sun Mon Tue Wed Thr Fri Sat");
		System.out.print(String.format("%" + (3 + 4 * (weekday - 1)) + "d", 1));
		int day = 2;
		for (int i = day; i < 7 - weekday + 2; i++) {
			System.out.print(String.format("%4d", i));
			day++;
		}
		int sunday = day % 7;
		for (int i = day; i <= days; i++) {
			if (i % 7 == sunday) {
				System.out.print("\n" + String.format("%3d", i));
			} else {
				System.out.print(String.format("%4d", i));
			}
			
		}
		System.out.print("\n");
	}

}
