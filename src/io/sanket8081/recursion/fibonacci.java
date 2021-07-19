package io.sanket8081.recursion;

public class fibonacci {

	public static void main(String[] args) {
		
		fibonacci f1= new fibonacci();
		int res=f1.fibo(10);
		System.out.println("Result : "+res);
		String curr="abc";
		curr = curr.substring(0, curr.length()-1);
		System.out.println(curr);
	}
	
	private int fibo(int n)
	{
		if(n < 1)
		{
			return 0;
			
		}
		else if(n == 1 || n == 2)
		{
			return n-1;
		}
		else {
			return fibo(n-1)+fibo(n-2);
		}
	}
}
