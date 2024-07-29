import java.util.*;
import java.io.*;
public class PrettyAveragePrimes {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static boolean isPrime(int n) {
    	if (n == 1 || n == 2) return false;
    	for (int i = 2; i <= Math.pow(n, 0.5); i++) {
    		if (n % i == 0) return false;
    	}
    	return true;
    }
    
    public static void main(String[] args) throws IOException{
    	int numCases = readInt();
    	
    	for (int i = 0; i < numCases; i++) {
    		int n = readInt();
    		
    		for (int j = 1; j < n; j++) {
    			if (isPrime(n + j) && isPrime(n - j)) {
    				System.out.println((n + j) + " " + (n - j));
    				break;
    			}
    		}
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
