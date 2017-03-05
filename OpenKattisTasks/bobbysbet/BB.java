package bobbysbet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BB {

	public static void main(String[] args) throws Exception {
		BufferedReader bfr = new BufferedReader(new FileReader("C:\\Users\\fknjerkz\\git\\OpenKattis\\OpenKattisTasks\\Input\\bb.in"));
		int antalKast = Integer.parseInt(bfr.readLine());
		int[] rsxyw = new int[5];
		StringTokenizer st;
		
		while(bfr.ready())
		{
			st = new StringTokenizer(bfr.readLine());
			int i = 0;
			while(st.hasMoreTokens())
			{
				rsxyw[i] = Integer.parseInt(st.nextToken());
				i++;
			}
			//System.out.println(rsxyw[0] + " " + rsxyw[1] + " " + rsxyw[2] + " " + rsxyw[3] + " " + rsxyw[4]);
		}
	}
}
/* https://open.kattis.com/problems/bobby

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