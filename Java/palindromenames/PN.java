package palindromenames;

import java.io.FileReader;
import java.util.Scanner;

public class PN {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\ALL\\Inlärning\\Git\\OpenKattisTasks\\OpenKattisTasks\\Input\\1.in");
		Scanner sc = new Scanner(fr);
		char[] nameChar, revNameChar;
		
		while(sc.hasNext())
		{
			String name = sc.next(), nRev;
			int nlength = name.length(), changes;
			nameChar = new char[nlength];
			
			for(int i = 0; i < nlength; i++)
			{
				nameChar[i] = name.charAt(i);
			}
			
			nRev = new StringBuilder(name).reverse().toString();
			
			if(name.equals(nRev))
				System.out.println(0);
			else {
				int j = nlength - 1;
				
				for(int i = 0; i < nlength; i++)
				{
					
				}
				
				/*
				if(name.length() % 2 != 0)
				{
					nRev = nRev.substring(0,1) + name.charAt(0);
				}
				int j = nlength - 1;
				for(int i = 0; i < nlength; i++)
				{
					if(!(name.charAt(i) == nameChar[j-i]))
					{
						
					}
				}
				*/
			}
		}
	}
}