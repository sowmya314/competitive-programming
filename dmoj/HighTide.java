import java.util.*;
import java.io.*;
public class HighTide {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
    	int n = readInt();
    	int[] d = new int[n];
    	
    	for (int i = 0; i < n; i++) d[i] = readInt();
    	
    	Arrays.sort(d);
    	    	
    	if (n % 2 != 0) System.out.print(d[n / 2] + " ");
    	
    	for (int i = n / 2 - 1; i >= 0; i--) {
    		if (n % 2 == 0) System.out.print(d[i] + " " + d[n - 1 - i] + " ");
    		if (n % 2 != 0) System.out.print(d[n - 1 - i] + " " + d[i] + " " );

    	}
    	
    	
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
