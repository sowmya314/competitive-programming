import java.util.*;
import java.io.*;

public class AveragingAverages {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long numQueries = Long.parseLong(br.readLine().split(" ")[1]);
		
		String[] averages = br.readLine().split(" ");
		long[] prefixSum = new long[averages.length];
		
		prefixSum[0] = Long.parseLong(averages[0]);
		
		for (int i = 1; i < averages.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + Long.parseLong(averages[i]);
		}
		
		for (int i = 0; i < numQueries; i++) {
			String[] line = br.readLine().split(" ");
			long lowerEnd = Long.parseLong(line[0]);
			long higherEnd = Long.parseLong(line[1]);
			if (lowerEnd == 1) {
				System.out.println((prefixSum[(int) higherEnd - 1]) / (higherEnd - lowerEnd + 1));
			} else {
				System.out.println((prefixSum[(int) higherEnd - 1] - prefixSum[(int) lowerEnd - 2]) / (higherEnd - lowerEnd + 1));
			}
		}
	}
	
	

}
