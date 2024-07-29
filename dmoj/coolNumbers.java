import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class coolNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long a = Long.parseLong(br.readLine()); //lower end
		long b = Long.parseLong(br.readLine()); //higher end
		long higher = 0;
		long lower = 0;
		if (Math.abs(Math.round(Math.pow(b,  1.0/6)) - Math.pow(b,  1.0/6)) < 0.000000001) {
			higher = Math.round(Math.pow(b,  1.0/6));
		} else {
			higher = (long) Math.floor(Math.pow(b, 1.0/6));
		}
		
		if (Math.abs(Math.pow(a,  1.0/6) - Math.round(Math.pow(b,  1.0/6))) < 0.000000001) {
			lower = Math.round(Math.pow(a,  1.0/6));
		} else {
			lower = (long) Math.ceil(Math.pow(a,  1.0/6));
		}
		
		System.out.println(higher - lower + 1);
		

	}

}
