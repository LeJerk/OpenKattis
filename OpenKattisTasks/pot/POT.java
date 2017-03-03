package pot;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class POT 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		double result = 0;
		
		while(bfr.ready())
		{
			String n = bfr.readLine();
			
			if(n.length() > 1)
			{
				double lastDigit = Double.parseDouble(n) % 10;
				result = result + Math.pow(Double.parseDouble(n.substring(0, n.length() -1)), lastDigit);
			}
		}
		System.out.println((int) result);
		bfr.close();
	}
}