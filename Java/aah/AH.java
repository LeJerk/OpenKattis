package aah;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AH {

	public static void main(String[] args) throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		String n = bfr.readLine();
		String m = bfr.readLine();
		
		System.out.println(n.length() >= m.length() ? "go" : "no");
	}
}