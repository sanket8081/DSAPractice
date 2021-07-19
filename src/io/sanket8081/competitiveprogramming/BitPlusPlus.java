//https://codeforces.com/problemset/problem/282/A

package io.sanket8081.competitiveprogramming;
import java.util.Scanner;

public class BitPlusPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x=0;
		int n= sc.nextInt();
		String [] oper = new String[n];
		
		for(int i=0;i<n;i++)
		{
			oper[i]=sc.next();
		}
		
		for(int i=0;i<n;i++)
		{
			if(oper[i].contains("++"))
			{
				x++;
			}
			else {
				x--;
			}
			
		}
		
		System.out.println(x);
	}

}
