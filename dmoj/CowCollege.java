import java.util.*;
import java.io.*;
public class CowCollege {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
    	int n = readInt();
    	long[] c = new long[n];
    	
    	for (int i = 0; i < n; i++) c[i] = readLong();
    	
    	Arrays.sort(c);
    	
    	int cows = n; long price = 0; long profit = 0;
    	
    	for (int i = 0; i < n; i++) {
    		if (cows * c[i] > profit) { profit = cows * c[i]; price = c[i]; }
    		cows--;
    	}
    	System.out.println(profit + " " + price);
    	
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
