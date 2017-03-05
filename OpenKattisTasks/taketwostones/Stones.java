package taketwostones;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Stones 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bfr.readLine());
		System.out.println(n % 2 == 1 ? "Alice" : "Bob");
	}
}