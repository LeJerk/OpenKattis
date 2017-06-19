package bobbysbet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BB 
{	
	// R = Total, S = antal sidor, X = minst antal kast, Y = totalt antal kast, W = gånger pengarna
	
	//For example, suppose Betty bets Bobby 1 bitcoin that he can’t roll at least a 5 on a 6-sided die at least two out of three
	//times; if Bobby does, she would give him W=3 times his initial bet (i.e. she would give him 3 bitcoins). 
	//Should Bobby take the bet (is his expected return greater than his original bet)?
	
	private static double chancePerDieThrow(int dieValue, int sides)
	{
		return (sides - dieValue + 1) / sides;
	}
	
	private static void propability(int x) 
	{
		minRoll 	= rsxyw[x][2];
		maxRoll 	= rsxyw[x][3];
		
		double[][] prob = new double[maxRoll + 1][maxRoll + 1];
	}
	
	private static void isWorthIt(int x) {
		double odds = rsxyw[x][4];
		
		for(int i=0;i<maxRoll;i++)
		{
			chancePerDieThrowToLoose = chancePerDieThrowToLoose * chancePerDieThrowToLoose;
			chancePerDie = chancePerDie * chancePerDie;
		}
		
		int worthIt = (int) (0.44444444444444444444444444444444 * odds - 1);
		//int worthIt2 = (int) (chancePerDieThrowToWin * odds - 1);
		
		System.out.println(worthIt);
		//System.out.println(worthIt2);
		/*
		if(worthIt < 0)
			System.out.println("no");
		else
			System.out.println("yes");	
		*/
	}

	public static void main(String[] args) throws Exception 
	{
		Scanner stdin = new Scanner(new FileReader("C:\\Users\\fknjerkz\\git\\OpenKattis\\OpenKattisTasks\\Input\\bb.in"));
		int cases = stdin.nextInt();
		
		while(cases != 0) {
			
			int dieValue 	= stdin.nextInt();
			int sides 		= stdin.nextInt();
			int minRoll 	= stdin.nextInt();
			int maxRoll 	= stdin.nextInt();
			int odds 		= stdin.nextInt();
			
			for(int i=0; i<cases; i++) {
				for(int j=0; j<cases; j++)
				chancePerDie = chancePerDieThrow(dieValue, sides);
				propability(x);
				isWorthIt(x);
				System.out.println();
			}
			cases--;
		}
		// R = Total, S = antal sidor, X = minst antal kast, Y = totalt antal kast, W = gånger pengarna
		
		bfr.close();
	}
}

/* 

Det finns 36=6*6 olika möjliga utfall alla med samma sannolikhet.

(1,1,1),(1,1,2),(1,1,3),(1,1,4),(1,1,5),(1,1,6)(1,2,1)(1,2,2)(1,2,3)(1,2,4)(1,2,5)(1,2,6)
(2,1,1),(2,1,2),(2,1,3),(2,1,4),(2,1,5),(2,1,6)
(3,1,2)
.
.
(5,1)(5,2)(5,3)(5,4)(5,5)(5,6)
6,1),..........(6,5)(6,6)

Antal sätt där det blir två lika är 6 stycken, de 6 i diagonalen.

Sannolikheten för två likadana är då:
(antalet sätt där vi får två lika)/(antal sätt totalt)=6/36=1/6

Tärnings antal sidor = S
Tärningens sidors värde = 1/S

bobby ska få en total större än eller lika med R på minst X av Y kast.

betty har flertalet tärningar med S sidor.
betty erbjuder bobby hans satsning gånger W för varje kast.

Exempel: Anta att betty satsar 1 BTC på att bobby inte får minst en 5a, 
på en tärning med 6(S) sidor, minst 2 av 3 ggr.
Om han lyckaas ger hon honom 3(W) gånger pengarna. 

Om Bobby skulle anta satsningen, är hans förväntade återbetalning
större än ursprungliga satsningen?

Input
Input begins with an integer 1≤N≤100001≤N≤10000, representing the number of cases that follow. 
The next NN lines each contain five integers, RR, SS, XX, YY, and WW. 
Their limits are 1≤R≤S≤201≤R≤S≤20, 1≤X≤Y≤101≤X≤Y≤10, and 1≤W≤1001≤W≤100.

Output
For each case, output “yes” if Bobby’s expected return is greater than his bet, or “no” otherwise. 
Bobby is somewhat risk averse and does not bet if his expected return is equal to his bet.

*/