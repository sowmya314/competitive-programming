import java.util.*;
import java.io.*;

public class BenchPressBob {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if ((n - 45) % 90 == 0) System.out.println("Let's go Bob!");
        else System.out.println("Rip Bob!");

        s.close();
    }
}
