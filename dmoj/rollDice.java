import java.util.Scanner;
public class rollDice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        int counter = 0;
        for (int i = 1; i <= m; i++) {
        	for (int j = 1; j <= n; j++) {
        		if (i + j == 10) {
        			counter++;
        		} else if (i > 9 && j > 9) {
        			break;
        		}
        	}
        }
        if (counter == 1) {
        	System.out.println("There is 1 way to get the sum 10.");
        } else {
        	System.out.println("There are " + counter + " ways to get the sum 10.");
        }
    }
}
