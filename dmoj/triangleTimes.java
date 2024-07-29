import java.util.Scanner;

public class triangleTimes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        double third = sc.nextDouble();
        sc.close();
        if (first + second + third != 180) {
            System.out.println("Error");
        } else {
            if (first == 60 && second == 60 && third == 60) {
                System.out.println("Equilateral");
            } else if (first != second && second != third && first != third) {
                System.out.println("Scalene");
            } else {
            	System.out.println("Isosceles");
            }
        }
    }
}
