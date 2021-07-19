//https://codeforces.com/problemset/problem/71/A

package io.sanket8081.competitiveprogramming;

import java.util.Scanner;

public class WayTooLongWords {

	public static void main(String[] args) {
		
		Scanner s1 =new Scanner(System.in);
		
		int noOfWords = s1.nextInt();
		String[] str = new String[noOfWords];
		for(int i=0;i<noOfWords;i++)
		{
			String st= s1.next();
			str[i] = st;
			st="";
		}
		
		for(int i=0;i<noOfWords;i++)
		{
			String st2 = str[i];
			String res="";
			int len=st2.length();
			if(len>10)
			{
				res+=st2.charAt(0);
				res+=String.valueOf(len-2);
				res+=st2.charAt(len-1);
				System.out.println(res+"");
			}
			else
			{
				res=st2;
				System.out.println(res+"");
			}
			
		}
		
	}

}
