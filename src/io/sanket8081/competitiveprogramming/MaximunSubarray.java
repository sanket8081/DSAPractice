package io.sanket8081.competitiveprogramming;

//https://leetcode.com/problems/maximum-subarray/
//Not solved
public class MaximunSubarray {

	public static void main(String[] args) {

		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		
		MaximunSubarray maximunSubarray =  new MaximunSubarray();
		System.out.println("Max sum: "+maximunSubarray.findMaxSubarray(nums));
	}
	
	//BruteForce approach
	public int findMaxSubarray(int [] nums)
	{
		int sum=0,max=0;
		int arrLength = nums.length;
		
		for(int i=0;i<arrLength;i++)
		{
			//sum=0;
			for(int j=0;j<arrLength;j++)
			{
				
					sum+=nums[j];
			}
		}
		
		return max;
	}

}
