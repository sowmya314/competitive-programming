import java.io.*;

public class alpacaRacing {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		long N = Long.parseLong(arr[0]);
		long K = Long.parseLong(arr[2]);
		long X = Long.parseLong(arr[3]);

		long timesUsed = 0;
		
		long[] speeds = new long[(int)N];
		
		for (int i = 0; i < N; i++) {
			speeds[i] = Long.parseLong(br.readLine());
		}
		
		long P = Long.parseLong(br.readLine());
		outerloop:
		for (int i = 0; i < N; i++) {
			long n = speeds[i];
			while (n >= P) {
				timesUsed++;
				n = (long) Math.floor((n * (100 - X) / (double) 100));
				if (timesUsed > K) {
					System.out.println("NO");
					break outerloop;
				}
				speeds[i] = n;
			}
			
		}
		
		if (timesUsed <= K) {
			System.out.println("YES");
		}
		
	}
}
