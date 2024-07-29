import java.util.*;
import java.io.*;
public class ModernArt {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
 
    public static void main(String[] args) throws IOException{
    	int numRows = readInt();
    	int numColumns = readInt();
    	int numChoices = readInt();
    	
    	int[] rows = new int[numRows];
    	int[] columns = new int[numColumns];
    	
    	for (int i = 0; i < numChoices; i++) {
    		String x = next();
    		int num = readInt();
    		if (x.equals("R")) {
    			rows[num - 1] += 1;
    		} else {
    			columns[num - 1] += 1;
    		}
    	}
    	int count = 0;
    	for (int row : rows) {
    		for (int column : columns) {
    			if ((row + column) % 2 != 0) {
    				count++;
    			}
    		}
    	}
    	System.out.println(count);
    	
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
