////https://codeforces.com/problemset/problem/231/A


package io.sanket8081.competitiveprogramming;

import java.util.Scanner;

public class Team {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num= sc.nextInt();
		int count=0;
		int sol=0;
		for(int i=0;i<num;i++)
		{
			int ip= sc.nextInt();
			if(ip==1)
				count++;
			int ip2= sc.nextInt();
			if(ip2==1)
				count++;
			int ip3= sc.nextInt();
			if(ip3==1)
				count++;
			if(count>=2)
			{
				sol++;
			}
			count=0;
		}
		System.out.println(sol);
	

	}

}
