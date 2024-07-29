import java.util.*;
import java.io.*;
public class HarpTuning {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
 
    public static void main(String[] args) throws IOException{
    	String input = next();
    	String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	for (int i = 0; i < input.length(); i++) {
    		if (letters.contains(input.substring(i, i+1))) {
    			if (i != 0 && !letters.contains(input.substring(i-1, i))) System.out.print("\n");
    			System.out.print(input.substring(i, i+1));
    		} else if (input.substring(i, i+1).equals("+")){
    			System.out.print(" tighten ");
    		} else if (input.substring(i, i+1).equals("-")) {
    			System.out.print(" loosen ");
    		} else {
    			System.out.print(input.substring(i, i+1));
    		}
    	}
    	System.out.print("\n");
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
