import java.util.Scanner;

public class rotatingLetters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sign = sc.next();
		boolean possible = true;
		
		for (int i = 0; i < sign.length(); i++) {
			if (!"I O S H Z X N ".contains(sign.charAt(i) + " ")) {
				System.out.println("NO");
				possible = false;
				break;
			}
		}
		
		if (possible) {
			System.out.println("YES");
		}
		sc.close();
	}

}
