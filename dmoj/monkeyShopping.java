import java.util.Scanner;

public class monkeyShopping {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if (b > a && d > c) {
			System.out.println("Go to the department store");
		} else if (b > a) {
			System.out.println("Go to the grocery store");
		} else if (d > c) {
			System.out.println("Go to the pharmacy");
		} else {
			System.out.println("Stay home");
		}
	}
}
