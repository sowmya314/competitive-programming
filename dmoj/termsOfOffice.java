import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class termsOfOffice {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int startYear = Integer.parseInt(br.readLine());
		int endYear = Integer.parseInt(br.readLine());
		for (int i = startYear; i <= endYear; i += 60) {
			System.out.println("All positions change in year " + i);
		}

	}

}
