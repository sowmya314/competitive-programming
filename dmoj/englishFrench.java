import java.util.*;

public class englishFrench {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String line = "";
		int s = 0;
		int t = 0;
		char character = 'a';
		for (int i = 0; i <= n; i++) {
			line = sc.nextLine();
			for (int j = 0; j < line.length(); j++) {
				character = line.charAt(j);
				if (character == 's' || character == 'S') {
					s++;
				} else if (character == 't' || character == 'T') {
					t++;
				}
			}
			
		}
		if (t > s) {
			System.out.println("English");
		} else {
			System.out.println("French");
		}
		sc.close();
	}
}
