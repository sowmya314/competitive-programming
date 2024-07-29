import java.io.*;
import java.util.Arrays;

public class MedianProblem {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] medians = new int[n];
		
		for (int i = 0; i < n; i++) {
			String[] line = br.readLine().split(" ");
			int[] numbers = new int[n];
			for (int j = 0; j < n; j++) {
				numbers[j] = Integer.parseInt(line[j]);
			}
			
			Arrays.sort(numbers);
			
			
			medians[i] = numbers[(n-1)/2];
		}
		
		Arrays.sort(medians);
		System.out.println(medians[(n-1)/2]);

	}

}
