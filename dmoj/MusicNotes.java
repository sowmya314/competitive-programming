import java.util.*;
import java.io.*;

public class MusicNotes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); int q = s.nextInt(); int[] sec = new int[n];
		sec[0] = 0;
		
		for (int i = 1; i < n; i++) {
			sec[i] = sec[i - 1] + s.nextInt();
		}
		
		s.nextInt();
		
		// for (int num : sec) System.out.println(num);
		
		for (int i = 0; i < q; i++) {
			int t = s.nextInt();
			for (int j = n - 1; j >= 0; j--) {
				if (sec[j] <= t) { 
					System.out.println(j + 1);
					break;
				}
			}
		}
		
		s.close();

	}

}
