import java.util.Scanner;
import java.lang.Math;

public class squares {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tiles = sc.nextInt();
        int length = (int) Math.pow(tiles, 0.5);
        System.out.println("The largest square has side length " + (length) + ".");
        sc.close();
    }
}
