package judgingtroubles;

import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JT {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\ALL\\Inlärning\\Git\\OpenKattisTasks\\OpenKattisTasks\\Input\\1.in");
		Scanner sc = new Scanner(fr);
		
		int submissions = sc.nextInt() * 2;
		int i, j, cases = 0;
		int[] uri;
		
		String[] textResults = new String[submissions];
		Set<String> ur = new HashSet<String>();
		String[] urs;
		
		for(i = 0; i < submissions; i++) {
			textResults[i] = sc.next();
			ur.add(textResults[i]);
		}
		
		urs = new String[ur.size()];	
		uri = new int[ur.size()];
		ur.toArray(urs);
		
		for(i = 0; i < textResults.length; i++)
		{		
			j = 0;
			while(j < ur.size()) {
				if(urs[j].contains(textResults[i]))
					uri[j]++;
				j++;
			}
		}
		
		for(i = 0; i < uri.length; i++)
		{
			cases = cases + (uri[i] / 2);
		}
		
		System.out.println(cases);
	}
}