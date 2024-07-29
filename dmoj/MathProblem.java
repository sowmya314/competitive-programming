import java.util.*;
import java.io.*;
public class MathProblem {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int k, p, x;
    public static double f(int M) throws IOException {
    	return M * x + k*p*1.0/M;
    }
    
    public static void main(String[] args) throws IOException{
    	k = readInt(); p = readInt(); x = readInt();
    	int m = 0; 
    	while (f(m) > f(m +1 )) m++;
    	
    	System.out.println(String.format("%.3f", f(m)));
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
