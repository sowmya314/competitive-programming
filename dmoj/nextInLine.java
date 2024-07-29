import java.util.Scanner;

public class nextInLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int younger = sc.nextInt();
		int middle = sc.nextInt();
		
		System.out.println(middle + middle - younger);
		
		sc.close();

	}

}
