package palindromenames;

import java.io.FileReader;
import java.util.Scanner;

public class PN2 {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\ALL\\Inlärning\\Git\\OpenKattisTasks\\OpenKattisTasks\\Input\\1.in");
		Scanner sc = new Scanner(fr);
		
		while(sc.hasNext())
		{
			String name = sc.next();
			int nLength = name.length(), changes = 0;
			
			if(nLength == 1)
			{
				System.out.println(0);
				continue;
			} else if(nLength == 2) 
			{
				if(name.charAt(0) == name.charAt(1)) 
				{
					System.out.println(0);
				} else {
					System.out.println(1);
				}
				continue;
			}
			
			StringBuilder first = new StringBuilder(name.substring(0, nLength / 2));
			StringBuilder last = new StringBuilder(name.substring(nLength / 2));
			
			for(int i = 0; i < last.length(); i++)
			{
				if(i == 0)
				{
					if(!(first.charAt(first.length() - 1) == last.charAt(1)))
							changes++;
				} else {
					if(!(first.charAt(first.length() - 1 - i) == last.charAt(i)))
					changes++;
				}
			}
		
			System.out.println(changes);
		}
	}
}