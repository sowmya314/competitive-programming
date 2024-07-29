import java.util.*;
import java.io.*;
public class VoronoiVillages {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
    	int n = readInt(); int[] arr = new int[n]; double minDist = Double.MAX_VALUE;
    	
    	for (int i = 0; i < n; i++) arr[i] = readInt(); 
    	
    	Arrays.sort(arr);
    	
    	for (int i = 1; i <= n - 2; i ++) {
    		double nei = (arr[i + 1] - arr[i - 1]) * 1.0 / 2;
    		if (nei < minDist) minDist = nei;
    	}
    	
    	System.out.println(String.format("%.1f", minDist));
    	
    	
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
