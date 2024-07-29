import java.util.*;
import java.io.*;
public class Sashimi {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
    	int t = readInt(); 
    	
    	for (int i = 0; i < t; i++) {
    		int a = readInt(); int b = readInt(); int n = readInt();
    		boolean bool = false;
    		
    		for (int j = 0; j <= n / a; j++) {
    			if ((n - j * a) % b == 0) {
    				System.out.println("YES");
    				bool = true;
    				break; 
    			}
    		}
    		if (!bool) System.out.println("NO");
    			
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
