import java.util.Scanner;

public class Squirrnect {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int w = 0;
		int h = 0;
		int[] dimensions = new int[t * 2];
		for (int i = 0; i < 2*t; i++) {
			dimensions[i] = sc.nextInt();
		}
		//System.out.println(" t: " + t);
		for (int i = 0; i < 2 * t; i += 2) {
			w = dimensions[i];
			h = dimensions[i + 1];
			//System.out.println("w: " + w + " h: " + h);
			if ((w == 1) || (w < 4 && h < 4) || (h == 1 && w < 7)) {
				System.out.println("bad");
			} else {
				System.out.println("good");
			}
		}
		sc.close();
	}
}
