import java.util.Scanner;

public class modInverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int m = sc.nextInt();
        boolean found = false;
        for (int i = 1; i < m; i++) {
            if ((x * i) % m == 1) {
                System.out.println(i);
                found = true;
                break;
            }
        }
        sc.close();
        if (!found) {
            System.out.println("No such integer exists.");
        }
    }
}
