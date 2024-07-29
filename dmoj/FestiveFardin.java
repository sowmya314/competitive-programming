import java.io.*;
import java.util.*;

public class FestiveFardin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String shirt = s.next();
        String pant = s.next();
        
        if ((shirt.equals("red") || shirt.equals("green") || shirt.equals("white")) && (pant.equals("red") || pant.equals("green") || pant.equals("white"))) {
            System.out.println("Jingle Bells");
        } else System.out.println("Boring...");
        s.close();

    }
}
