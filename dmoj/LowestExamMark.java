import java.io.*;
import java.lang.Math;

public class LowestExamMark {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int curMark = Integer.parseInt(br.readLine());
		double goalMark = Double.parseDouble(br.readLine()) - 0.5;
		double weight = Double.parseDouble(br.readLine()) / 100;
		double ans = Math.round((goalMark - (curMark * (1 - weight))) / weight);
		if (ans > 100) {
			System.out.println("DROP THE COURSE");
		} else if (ans < 0) {
			System.out.println(0); 
		} else {
			System.out.println(Math.round(ans));
		}
		
		

	}

}
