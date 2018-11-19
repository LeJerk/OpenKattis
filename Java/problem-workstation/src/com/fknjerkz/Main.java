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
		int arrive = 0;
		int stay = 0;

		int[][] allResearchersData = new int[nbrOfFokz][2];
		int[] arrivalTimes = new int[nbrOfFokz];
		int[] timeStayed = new int[nbrOfFokz];

		for (int i = 0; i < nbrOfFokz; i++)
		{
			arrive = sc.nextInt();
			stay = sc.nextInt();

			allResearchersData[i][0] = arrive;
			allResearchersData[i][1] = stay;

			arrivalTimes[i] = arrive;
			timeStayed[i] = stay;
		}

		Arrays.sort(allResearchersData, Comparator.comparing((int[] arr) -> arr[0]));

		int nbrOfUnlocks = 1;
		int leave = 0;
		int timeToWorkstationLock = 0;

		for (int i = 0; i < allResearchersData.length; i++)
		{
			if (i > 0)
			{
				arrive = allResearchersData[i][0];
			}

			stay = allResearchersData[i][1];

			timeToWorkstationLock = timeout + stay;

			if (timeToWorkstationLock < arrive)
			{
				nbrOfUnlocks++;
			}
		}

		System.out.println(nbrOfFokz - nbrOfUnlocks);
	}
}
        
