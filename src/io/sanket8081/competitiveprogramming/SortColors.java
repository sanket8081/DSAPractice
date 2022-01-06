package io.sanket8081.competitiveprogramming;
//https://leetcode.com/problems/sort-colors/
public class SortColors {

	 public void sortColors(int[] nums) {
	        
	        int zeroCount = 0;
	        int oneCount = 0;
	        int twoCount = 0;
	        int size = nums.length;
	        for(int i=0;i<size;i++)
	        {
	            if(nums[i] == 0)
	                zeroCount++;
	            if(nums[i] == 1)
	                oneCount++;
	            if(nums[i] == 2)
	                twoCount++;
	        }
	        
	        for(int i=0;i<size;i++)
	        {
	            if(zeroCount>0)
	            {
	                zeroCount--;
	                nums[i]=0;
	            }
	            else if(oneCount>0)
	            {
	                oneCount--;
	                nums[i]=1;
	            }
	            else if(twoCount>0)
	            {
	                twoCount--;
	                nums[i]=2;
	            }
	             
	        }
	        
	        
	        
	    }
}
