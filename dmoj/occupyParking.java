import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class occupyParking {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int counter = 0;
		String yesterday = br.readLine();
		String today = br.readLine();
		
		for (int i = 0; i < N; i++) {
			if (yesterday.charAt(i) == today.charAt(i) && today.charAt(i) == 'C') {
				counter++;
			}
		}
		System.out.println(counter);

	}

}
