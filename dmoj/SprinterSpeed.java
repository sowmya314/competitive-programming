import java.util.*;
import java.io.*;
public class SprinterSpeed {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
 
    public static void main(String[] args) throws IOException{
    	int n = readInt();
    	
    	Map<Integer, Integer> map = new HashMap<>();
    	int[] times = new int[n];
    	
    	for (int i = 0; i < n; i++) {
    		times[i] = readInt();
    		map.put(times[i], readInt());
    		
    	}
    	
    	Arrays.sort(times);
    	
    	double max = 0;
    	
    	for (int i = 0; i < n - 1; i++) {
    		double speed = (map.get(times[i]) - map.get(times[i+1]))*1.0 / (1.0* (times[i] - times[i+1]));
    		if (Math.abs(speed) > max) max = Math.abs(speed); 
    	}
    	
    	System.out.println(max);
    	
    	
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
