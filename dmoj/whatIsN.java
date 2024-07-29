import java.util.Scanner;

public class whatIsN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int counter = 0;
		
		for (int i = 0; i <= num / 2; i++) {
			if (i <= 5 && (num - i) <= 5) {
				counter++;
			}
		}
		
		sc.close();
		
		System.out.println(counter);

	}

}
