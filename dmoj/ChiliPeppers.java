import java.util.*;
import java.io.*;
public class ChiliPeppers {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
 
    public static void main(String[] args) throws IOException{
    	int n = readInt();
    	int spice = 0;
    	for (int i = 0; i < n; i++) {
    		String pepper = next();
    		if (pepper.equals("Poblano")) spice += 1500;
    		if (pepper.equals("Mirasol")) spice += 6000;
    		if (pepper.equals("Serrano")) spice += 15500;
    		if (pepper.equals("Cayenne")) spice += 40000;
    		if (pepper.equals("Thai")) spice += 75000;
    		if (pepper.equals("Habanero")) spice += 125000;
    	}
    	System.out.println(spice);
    }
 
    static String next () throws IOException {
        while (st == null || ! st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static long readLong () throws IOException {
        return Long.parseLong(next());
    }
    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }
    static double readDouble () throws IOException {
        return Double.parseDouble(next());
    }
    static char readCharacter () throws IOException {
        return next().charAt(0);
    }  
    static String readLine () throws IOException {
        return br.readLine().trim();
    }
}
