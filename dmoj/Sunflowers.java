import java.util.*;
import java.io.*;
public class Sunflowers {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n;
    
    public static boolean good(int[][] arr) {
    	int count = 0;
    	for (int j = 0; j < n; j++) {
    		for (int i = 0; i < n - 1; i++) {
    			if (arr[i][j] < arr[i + 1][j]) count++;
    		} 
    	}
    	for (int i = 0; i < n; i++) {
    		for (int j = 0; j < n - 1; j++) {
    			if (arr[i][j] < arr[i][j + 1]) count++;
    		} 
    	}
    	if (count == 2 * n * (n - 1)) {
    		return true;
    	} else { return false; }
    }
    
    public static int[][] rotate(int[][] arr) {
    	int[][] arr2 = new int[n][n];
    	for (int i = 0; i < n; i++) {
    		for (int j = 0; j < n; j++) {
    			arr2[j][n - 1 - i] = arr[i][j];
    		}
    	}
    	return arr2;
    }
    
    public static void main(String[] args) throws IOException{
    	n = readInt(); int[][] arr = new int[n][n];
    	
    	for (int i = 0; i < n; i++) {
    		for (int j = 0; j < n; j++) {
    			arr[i][j] = readInt();
    		}
    	}
    	
    	if (!good(arr)) arr = rotate(arr); 
    	if (!good(arr)) arr = rotate(arr);
    	if (!good(arr)) arr = rotate(arr);

    	for (int i = 0; i < n; i++) {
    		for (int j = 0; j < n; j++) {
    			System.out.print(arr[i][j] + " ");
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
