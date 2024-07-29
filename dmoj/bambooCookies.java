import java.util.Scanner;

public class bambooCookies {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int odd = 0;
		int even = 0;
		for (int i = 0; i < n; i ++) {
			if (sc.nextInt() % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println(odd / 2 + even / 2);
	}
}
