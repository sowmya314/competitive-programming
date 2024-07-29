import java.util.*;
import java.io.*;
public class Main2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
   
    public static void main(String[] args) throws IOException{
    	int n = readInt();
    	int[] swifts = new int[n];
    	int[] semaphores = new int[n]; 
    	int score1 = 0; int score2 = 0;
    	
    	for (int i = 0; i < n; i++) { swifts[i] = readInt(); score1 += swifts[i]; }
    	for (int i = 0; i < n; i++) { semaphores[i] = readInt(); score2 += semaphores[i]; }
    	
    	boolean b = true;
    	
    	if (score1 == score2) { System.out.println(n); b = false; }
    	
    	for (int i = n - 1; i >= 0; i--) { 
    		score1 -= swifts[i]; score2 -= semaphores[i];
    		if (score1 == score2 && b) {
    			System.out.println(i);
    			break;
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
