package wordsfornumbers;

<<<<<<< HEAD
import java.io.InputStreamReader;
=======
>>>>>>> branch 'jobbdatorn' of https://github.com/fknjerkz/OpenKattis.git
import java.util.Scanner;

public class WNF2 {
    static String ones[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static String tens[] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    
<<<<<<< HEAD
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		String line;
		String[] asplit;
		
		while(sc.hasNext()) 
		{
			line = sc.nextLine();
			asplit = line.split(" ");
			
			for(int i=0; asplit.length > i;i++) 
			{
				if(!asplit[0].trim().isEmpty() && Character.isDigit(asplit[i].charAt(0))) 
				{
					printNumberWord(Integer.parseInt(asplit[i]), i);
				} else {
					System.out.print(asplit[i]);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void printNumberWord(int x1, int i)
	{
		int x2;
		
		if(x1 > 19) 
		{
			x2 = x1 % 10;
			
			if(x2 != 0) 
			{
				System.out.print(i == 0 ? tens[x1 / 10].substring(0, 1).toUpperCase() + tens[x1 / 10].substring(1) : tens[x1 / 10]);
				System.out.print("-" + ones[x2]);
			} else {
				System.out.print(i == 0 ? tens[x1 / 10].substring(0, 1).toUpperCase() + tens[x1 / 10].substring(1) : tens[x1 / 10]);
			}
		} else {
			System.out.print(i == 0 ? ones[x1].substring(0, 1).toUpperCase() + ones[x1].substring(1) : ones[x1]);
		}
	}
}
=======
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line;
        String[] asplit;
        
        while(sc.hasNext()) 
        {
            line = sc.nextLine();
            asplit = line.split(" ");
            
            for(int i=0; asplit.length > i;i++) 
            {
                if(!asplit[0].trim().isEmpty() && Character.isDigit(asplit[i].charAt(0))) 
                {
                    printNumberWord(Integer.parseInt(asplit[i]), i);
                } else {
                    System.out.print(asplit[i]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void printNumberWord(int x1, int i)
    {
        int x2;
        
        if(x1 > 19) 
        {
            x2 = x1 % 10;
            
            if(x2 != 0) 
            {
                System.out.print(i == 0 ? tens[x1 / 10].substring(0, 1).toUpperCase() + tens[x1 / 10].substring(1) : tens[x1 / 10]);
                System.out.print("-" + ones[x2]);
            } else {
                System.out.print(i == 0 ? tens[x1 / 10].substring(0, 1).toUpperCase() + tens[x1 / 10].substring(1) : tens[x1 / 10]);
            }
        } else {
            System.out.print(i == 0 ? ones[x1].substring(0, 1).toUpperCase() + ones[x1].substring(1) : ones[x1]);
        }
    }
}
>>>>>>> branch 'jobbdatorn' of https://github.com/fknjerkz/OpenKattis.git
