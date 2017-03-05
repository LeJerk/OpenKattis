package simonsays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SimonS 
{
	public static void main(String[] args) throws Exception 
	{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		bfr.readLine();
		
		while(bfr.ready())
		{
			String line = bfr.readLine();
			
			if(line.startsWith("simon says"))
				System.out.println(line.replaceAll("simon says", ""));
			else
				System.out.println();
		}
		bfr.close();
	}
}