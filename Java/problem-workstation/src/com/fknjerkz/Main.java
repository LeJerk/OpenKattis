package com.fknjerkz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		String currentDirectory = new File("").getAbsolutePath();
		Scanner sc = new Scanner(new FileReader(currentDirectory+"/input"));

		int nbrOfFokz = sc.nextInt();
		int timeout = sc.nextInt();

		int[][] allResearchers = new int[nbrOfFokz][2];

		for (int i = 0; i < nbrOfFokz; i++)
		{
			allResearchers[i][0] = sc.nextInt();
			allResearchers[i][1] = sc.nextInt();
		}

		Arrays.sort(allResearchers, Comparator.comparing((int[] arr) -> arr[0]));

		int nbrOfUnlocks = 1;
		int unlockMinute = 0;
		int arrive = 0;
		int stay = 0;

		for (int i = 0; i < allResearchers.length; i++)
		{
			if (i + 1 == allResearchers.length)
			{
				break;
			}

			if (i > 0)
			{
				unlockMinute = allResearchers[i][0];
			}

			stay = allResearchers[i][1];

			arrive = unlockMinute + stay;

			if (arrive > allResearchers[i + 1][0])
			{
				nbrOfUnlocks++;
			}
		}

		System.out.println(nbrOfFokz - nbrOfUnlocks);
	}
}
        
