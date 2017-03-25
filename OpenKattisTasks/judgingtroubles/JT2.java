package judgingtroubles;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JT2 {

	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		
		int submissions = sc.nextInt(), i, cases = 0;
		String r;
		Map<String, Integer> results = new HashMap();
		
		for(i = 0; i < submissions; i++) 
		{
			r = sc.next();
			if(!results.containsKey(r))
				results.put(r, 1);
			else 
				results.put(r, results.get(r) + 1);			
		}
		
		for(i = 0; i < submissions; i++) 
		{
			r = sc.next();
			if(results.containsKey(r) && results.get(r) > 0)
			{
				results.put(r, results.get(r) - 1);
				cases++;
			}					
		}

		System.out.println(cases);
	}
}