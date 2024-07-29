import java.io.*;
import java.util.*;

public class PageTurning {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long evenSum = 0;
		long oddInconvenience = 0;
		
		List<Long> even = new ArrayList<>();
		List<Long> odd = new ArrayList<>();
		
		String[] input = br.readLine().split(" ");
		
		for (int i = 0; i < n; i++) {
			long val = Long.parseLong(input[i]);
			
			if (val % 2 == 0) {
				evenSum += val;
				even.add((long) i + 1);
			} else {
				oddInconvenience += val / 2;
				odd.add((long) i + 1);
			}
		}
		if (odd.size() == 0) {
			System.out.println(evenSum / 2);
			for (int i = 1; i <= n; i++) {
				System.out.print(i + " ");
			}
			System.out.print("\n");
		} else {
			System.out.println(oddInconvenience + evenSum/2 - even.size());
			System.out.print(odd.get(0) + " ");
			for (long val : even) {
				System.out.print(val + " ");
			}
			for (int i = 1; i < odd.size(); i++) {
				System.out.print(odd.get(i) + " ");
			}
			System.out.print("\n");
			
		}
		
	}
}
