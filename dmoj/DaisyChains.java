import java.util.*;
import java.io.*;

public class DaisyChains {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[] input = br.readLine().split(" ");
		int[] prefixSum = new int[n];
		
		prefixSum[0] = Integer.parseInt(input[0]);
				
		for (int i = 1; i < n; i++) {
			prefixSum[i] = Integer.parseInt(input[i]) + prefixSum[i - 1];
		}
		int ans = 0;
		double val;

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (i == 0) {
					val = prefixSum[j]*1.0/(j + 1);
				} else {
					val = (prefixSum[j] - prefixSum[i - 1])*1.0 / (j - i + 1);
				}
				for (int k = i; k <= j; k++) {
					if (Integer.parseInt(input[k]) == (val)) {
						ans++;
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
