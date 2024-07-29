import java.util.Scanner;

public class dressingUp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        for (int i = 1; i <= h; i += 2) {
            System.out.println("*".repeat(i) + " ".repeat(2*h - 2*i) + "*".repeat(i));
        }
        for (int i = h - 2; i >= 1; i -= 2) {
            System.out.println("*".repeat(i) + " ".repeat(2*h - 2*i) + "*".repeat(i));
        }
        sc.close();
    } 
}
