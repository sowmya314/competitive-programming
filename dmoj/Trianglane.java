import java.util.*;
import java.io.*;

public class Trianglane {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int columns = Integer.parseInt(br.readLine());
		int answer = 0;
		
		String[] row1 = br.readLine().split(" ");
		String[] row2 = br.readLine().split(" ");
		
		for (int i = 0; i < columns; i++) {
			if (row1[i].equals("1")) {
				answer += 3;
			}
			if (row2[i].equals("1")) {
				answer += 3;
			}
		}
		
		for (int i = 0; i < columns -1; i++) {
			if (row1[i].equals(row1[i + 1]) &&  row1[i].equals("1")) {
				answer-=2;
			}
			if (row2[i].equals(row2[i + 1]) && row2[i].equals("1")) {
				answer-=2;
			}
			if ((i % 2 == 0) && (row1[i].equals(row2[i])) && (row1[i].equals("1"))) {
				answer-=2;
			}
		}
		
		if ((columns % 2 == 1) && row1[columns - 1].equals(row2[columns - 1]) && row1[columns - 1].equals("1")) {
			answer-=2;
		}
		
		System.out.println(answer);
		
		

	}

}
