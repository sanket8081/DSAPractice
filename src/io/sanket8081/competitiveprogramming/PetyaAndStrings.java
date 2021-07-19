//https://codeforces.com/problemset/problem/112/A

//aslkjlkasdd
//asdlkjdajwi

package io.sanket8081.competitiveprogramming;

import java.util.Scanner;

public class PetyaAndStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next().toLowerCase();
		String str2 = sc.next().toLowerCase();
		int temp1=0,temp2=0;
		int val1=0,val2=0;
		for(int i=0;i<str1.length();i++) {
			temp1=str1.charAt(i);
			temp2=str2.charAt(i);
			if(temp1<temp2)
			{
				System.out.println("-1");
				System.exit(0);
			}
			else if(temp1>temp2)
			{
				System.out.println("1");
				System.exit(0);
			}
	
			 val1 += str1.charAt(i);
			 val2 +=str2.charAt(i);
		}
		
		if(val1==val2)
		{
			System.out.println("0");
		}
		
	}

}
