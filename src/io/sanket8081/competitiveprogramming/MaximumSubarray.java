package io.sanket8081.competitiveprogramming;
//https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray {

	public int maxSubArray(int[] nums) {
	        
	        int sum=0;
	        int max = nums[0];
	        int size = nums.length;
	        for (int i=0;i<size;i++)
	        {
	            sum+=nums[i];
	            
	            if(sum>max)
	                max = sum;
	            if(sum<0)
	                sum = 0;
	        }
	        
	        return max;
	        
	    }
}
