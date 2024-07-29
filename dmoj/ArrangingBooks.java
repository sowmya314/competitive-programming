import java.util.*;
import java.io.*;
public class ArrangingBooks {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
 
    public static void main(String[] args) throws IOException{
    	String arrangement = next();
    	int L = 0; int M = 0;
    	for (int i = 0; i < arrangement.length(); i++) {
    		if (arrangement.charAt(i) == 'M') M++;
    		if (arrangement.charAt(i) == 'L') L++;
    	}
    	int ans = 0;
    	int minl = 0; int linm = 0;
    	for (int i = 0; i < L; i++) {
    		if (arrangement.charAt(i) == 'S' || arrangement.charAt(i) == 'M') ans++;
    		if (arrangement.charAt(i) == 'M') minl++;
    	}
    	for (int i = L; i < L + M; i++) {
    		if (arrangement.charAt(i) == 'S' || arrangement.charAt(i) == 'L') ans++;
    		if (arrangement.charAt(i) == 'L') linm++;
    	}
    	
    	ans -= Math.min(minl, linm);
    	System.out.println(ans);
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
