import java.util.*;
import java.io.*;
public class CrazyFencing {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
 
    public static void main(String[] args) throws IOException{
    	int n = readInt();
    	int[] height = new int[n + 1];
    	int[] width = new int[n];
    	
    	for (int i = 0; i < n + 1; i++) {
    		height[i] = readInt();
    	}
    	
    	for (int i = 0; i < n; i++) {
    		width[i] = readInt();
    	}
    	int ans = 0;
    	
    	for (int i = 0; i < n; i++) {
    		ans += width[i] * (height[i] + height[i+1]);
    	}
    	if (ans % 2 == 0) {
    		System.out.println(ans / 2);
    	}
    	else {
    		System.out.println(ans / 2.0);
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
