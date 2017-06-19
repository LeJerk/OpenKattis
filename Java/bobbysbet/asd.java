package bobbysbet;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class asd {

	public static void main(String[] args) throws Exception {
		Scanner stdin = new Scanner(new FileReader("C:\\Users\\fknjerkz\\git\\OpenKattis\\OpenKattisTasks\\Input\\bb.in"));
		int numCases = stdin.nextInt();

		// Process each case.
		for (int loop=0; loop<numCases; loop++) {

			// Get all problem data.
			int low = stdin.nextInt();
			int max = stdin.nextInt();
			int numSuccesses = stdin.nextInt();
			int numTrials = stdin.nextInt();
			int pay = stdin.nextInt();

			// Run DP, similar to filling combo table.
			double pSuccess = (double)(max-low+1)/max;
			double[][] prob = new double[numTrials+1][numTrials+1];
			prob[0][0] = 1;
			for (int i=0; i<=numTrials; i++) {
				for (int j=0; j<=numTrials; j++) {

					// Here, we win the last game to get to i wins, j losses.
					if (i > 0) prob[i][j] += (prob[i-1][j]*pSuccess);

					// Here we lose the last game to get to i wins, j losses.
					if (j > 0) prob[i][j] += (prob[i][j-1]*(1-pSuccess));
				}
			}

			// Add up all outcomes with numSuccesses or more successes.
			double res = 0;
			for (int i=numSuccesses; i<=numTrials; i++)
				res += prob[i][numTrials-i];

			// Print the result.
			if (pay*res > 1+1e-9)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}