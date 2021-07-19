package io.sanket8081.recursion;

public class GeneratingSubset {

	public static void main(String[] args) {
		
		String str = "abc";
		int index = -1;
		String curr = "";
		powerSet(str,index,curr);
		//foo(3);
	}
	
	static void foo(int n)
	{
		if(n<1)
			return;
		else
			foo(n-1);
		System.out.println("hello : "+n);
			
			
	}
	
	static void powerSet(String str , int index,String curr)
	{
		int n = str.length();
		if(index == n)
		{
			return;
		}
		
		
		System.out.println(curr);
		
		for(int i=index+1;i<n;i++)
		{
			curr+=str.charAt(i);
			powerSet(str, i, curr);
			
			
			curr = curr.substring(0, curr.length()-1);
		}
		
		
	}
	

}
