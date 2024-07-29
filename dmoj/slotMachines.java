import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class slotMachines {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int quarters = Integer.parseInt(br.readLine());
		int first = Integer.parseInt(br.readLine());
		int second = Integer.parseInt(br.readLine());
		int third = Integer.parseInt(br.readLine());
		int timesPlayed = 0;
		
		while (quarters > 0) {
			if (timesPlayed % 3 == 0) {
				first++;
				if (first % 35 == 0) {
					quarters += 30;
				}
			} else if (timesPlayed % 3 == 1) {
				second++;
				if (second % 100 == 0) {
					quarters += 60;
				}
			} else {
				third++;
				if (third % 10 == 0) {
					quarters += 9;
				}
			}
			
			quarters--;
			timesPlayed++;
		}
		
		System.out.println("Martha plays " + timesPlayed + " times before going broke.");
	}

}
