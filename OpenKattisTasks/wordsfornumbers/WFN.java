package wordsfornumbers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WFN {
	
	static String ones[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static String tens[] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

	public static void main(String[] args) throws Exception {
		BufferedReader bfr = new BufferedReader(new FileReader("C:\\ALL\\Inlärning\\Git\\OpenKattisTasks\\OpenKattisTasks\\Input\\1.in"));
		StringTokenizer st;
		String s;
			
		while(bfr.ready())
		{
			st = new StringTokenizer(bfr.readLine());
			int i = 0;
			
			while(st.hasMoreTokens()) 
			{
				s = st.nextToken();
				
				if(s.matches("\\d*"))
				{
					if(i == 0)
						numberToWord(s, 1);
					else 
						numberToWord(s, 0);
				} else 
					System.out.print(s + " ");
				i++;
			}
			
			System.out.println();
		}
		
		bfr.close();
	}
	
	public static void numberToWord(String s, int x) 
	{     
		String s1, s2;
		String text = " ";
		int sc = Integer.parseInt(s);
		
        if (sc > 19) {
        	if(x == 1) {
        		 s1 = tens[sc / 10].substring(0, 1).toUpperCase();
        		 s2 = s1 + tens[sc / 10].substring(1);
        		 
        		 text = s2 + "-" + ones[sc % 10];
        	} else {
				if(sc % 10 == 0)
					text = tens[sc / 10] + " ";
				else
					text = tens[sc / 10] + "-" + ones[sc % 10];
        	}
        		
        } else if(sc == 0) {
        	if(x == 1)
        		text = "Zero";
        	else
        		text = "zero";
		} else {
			if(x == 1) {
				s1 = ones[sc].substring(0, 1).toUpperCase();
				text = s1 + ones[sc].substring(1);
	       	} else {
	       		text = ones[sc];
	       	}
		}
        
        System.out.print(text + " ");
    }
}
