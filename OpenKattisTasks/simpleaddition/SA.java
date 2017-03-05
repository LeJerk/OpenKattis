package simpleaddition;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SA 
{
	public static void main(String[] args) throws Exception 
	{
		 BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
         BigInteger n = new BigInteger(bfr.readLine());
         BigInteger m = new BigInteger(bfr.readLine());
         System.out.println(m.add(n).toString());
	}
}