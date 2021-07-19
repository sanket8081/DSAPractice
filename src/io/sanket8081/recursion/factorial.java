package io.sanket8081.recursion;

public class factorial {

	public static void main(String[] args) {
		
		factorial f1= new factorial();
		int res=f1.fact(4);
		System.out.println("Result : "+res);
	}
	
	private int fact(int number)
	{
		
		if(number <= 1)
		{
			return 1;
		}
		
		return (number*fact(number-1));
		
	}

}
