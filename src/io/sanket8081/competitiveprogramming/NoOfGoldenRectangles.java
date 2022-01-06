package io.sanket8081.competitiveprogramming;

import java.util.Scanner;

public class NoOfGoldenRectangles {
	
	public static void main(String args[])
	{
		
		Scanner sc =  new Scanner(System.in);
		
		int number = sc.nextInt();
		int count=0;
		for(int i=0;i<number;i++)
		{
			long width = sc.nextInt();
		    long height = sc.nextInt();
			
			double result = (double)width/height;
			System.out.println(result+"\n");
			if(result >=(double)1.60 && result <=(double)1.70 )
			{
				//System.out.println(result+"\n");	
				count++;
			}
		}
		System.out.println(count);
	}
}
