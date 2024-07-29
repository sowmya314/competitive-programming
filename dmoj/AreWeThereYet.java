import java.util.*;
import java.io.*;
public class AreWeThereYet {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
    	
    	int[] d = new int[5]; 
    	d[0] = 0;
    	for (int i = 1; i <= 4; i++) d[i] = readInt() + d[i - 1];
    	    	
    	for (int i = 0; i < 5; i++) {
    		for (int j = 0; j < 5; j++) {
    			System.out.print(Math.abs(d[i] - d[j]) + " ");
    		}
    		System.out.println();
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
