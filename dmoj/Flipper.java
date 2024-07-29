import java.util.*;
import java.io.*;
public class Flipper {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
 
    public static void main(String[] args) throws IOException{
    	int[] in = new int[4];
    	in[0] = 1; in[1] = 2; in[2] = 3; in[3] = 4;
    	String input = next();
    	
    	for (int i = 0; i < input.length(); i++) {
    		int[] in2 = in.clone();
    		if (input.charAt(i) == 'H') {
    			in[0] = in2[2]; in[2] = in2[0]; in[3] = in2[1]; in[1] = in2[3];
    		} else {
    			in[0] = in2[1]; in[1] = in2[0]; in[3] = in2[2]; in[2] = in2[3];
    		}
    	}
    	
    	System.out.println(in[0] + " " + in[1] + "\n" + in[2] + " " + in[3]);
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
