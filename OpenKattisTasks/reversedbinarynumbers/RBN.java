package reversedbinarynumbers;
// new FileReader("C:\\ALL\\Inlärning\\Git\\OpenKattisTasks\\OpenKattisTasks\\Input\\1.in"));

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RBN 
{
	public static void main(String[] args) throws Exception 
	{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bfr.readLine());
		bfr.close();
		
		String o, nReversed;
		o = Integer.toBinaryString(n);
		nReversed = new StringBuilder(o).reverse().toString();
		System.out.println(Integer.parseInt(nReversed, 2));
	}	
}