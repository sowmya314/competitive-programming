import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cellSell {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int daytime = Integer.parseInt(br.readLine());
		int evening = Integer.parseInt(br.readLine());
		int weekend = Integer.parseInt(br.readLine());
		double planA = 15 * evening + 20 * weekend;
		double planB = 35 * evening + 25 * weekend;
		
		if (daytime > 250) {
			planA += 25 * (daytime - 100);
			planB += 45 * (daytime - 250);
		} else if (daytime > 100) {
			planA += 25 * (daytime - 100);
		}
		
		System.out.println("Plan A costs " + String.format("%.2f", planA / 100));
		System.out.println("Plan B costs " + String.format("%.2f", planB / 100));
		if (planA < planB) {
			System.out.println("Plan A is cheapest.");
		} else if (planA == planB) {
			System.out.println("Plan A and B are the same price.");
		} else {
			System.out.println("Plan B is cheapest.");
		}
		

	}

}
