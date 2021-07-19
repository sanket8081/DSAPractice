//https://leetcode.com/problems/richest-customer-wealth/

package io.sanket8081.competitiveprogramming;

public class RichestCustomerWealth {

	public static void main(String[] args) {
		
		int arr2 [][] = {{10,20,30},{40,50,60}};
		RichestCustomerWealth r = new RichestCustomerWealth();
		
		int maxWealth = r.maximumWealth(arr2);
		System.out.println(maxWealth);
	}
	
	public int maximumWealth(int[][] accounts) {
		
		int arrlen = accounts.length;
		int innerarr = accounts[0].length;
		
		for(int i=0;i<arrlen;i++)
		{
			int sum=0;
			for(int j=0;j<innerarr;j++)
			{
				sum+=accounts[i][j];
			}
			accounts[i][0]=sum;
			sum=0;
		}
		
		int maxAmt = accounts[0][0];
		for(int i=1;i<arrlen;i++)
		{
			if(accounts[i][0]>maxAmt)
			{
				maxAmt=accounts[i][0];
			}
			
			
		}
		
        return maxAmt;
    }

}
