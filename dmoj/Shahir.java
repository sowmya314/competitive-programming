import java.util.*;
import java.io.*;
public class Shahir {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
    	int n = readInt(); int m = readInt(); int start = readInt() - 1; int date = readInt() - 1;
    	int[][] adj = new int[n][n];
    	Queue<Integer> q = new LinkedList<>();
    	boolean[] visited = new boolean[n];

    	for (int i = 0; i < m; i++) {
    		int first = readInt() - 1; int second = readInt() - 1;
    		adj[first][second] = 1;
    		adj[second][first] = 1;
    	}
    	q.add(start); visited[start] = true; 
    	while (!q.isEmpty()) {
    		int cur = q.peek(); q.remove();
    		for (int nxt = 0; nxt < adj[cur].length; nxt++) {
    			if ((!visited[nxt]) && adj[cur][nxt] == 1) {
    				q.add(nxt);
    				visited[nxt] = true;
    			}
    		}
    	}
    	System.out.println(visited[date]? "GO SHAHIR!" : "NO SHAHIR!");
    	
    }
    static String next () throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(readLine());
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
