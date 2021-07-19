//https://codeforces.com/problemset/problem/158/A
package io.sanket8081.competitiveprogramming;

import java.util.Scanner;

public class NextRound {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		
		int num =  sc.nextInt();
		int kplace = sc.nextInt();
		int[] arr= new int[num] ;
		for(int i=0;i<num;i++)
		{
			arr[i]= sc.nextInt();
		}
		int kplaceVal= arr[kplace-1];
		int count=0;
		for(int i=0;i<num;i++)
		{
			if(arr[i]>=kplaceVal && arr[i]>0) 
				count++;
		}
		
		System.out.println(count);
	}

}
