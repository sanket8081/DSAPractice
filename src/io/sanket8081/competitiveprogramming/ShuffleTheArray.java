//https://leetcode.com/problems/shuffle-the-array/
	
package io.sanket8081.competitiveprogramming;

public class ShuffleTheArray {

	public static void main(String[] args) {
		int arr[] = {2,5,1,3,4,7};
		ShuffleTheArray s = new ShuffleTheArray();
		s.shuffle(arr, 3);
	}
	
	public int[] shuffle(int[] nums, int n) {
		int newArr[] = new int[nums.length];
		for(int i=0;i<n;i++)
		{
				//System.out.println(nums[i]+","+nums[i+n]);
				newArr[i+i]=nums[i];
				newArr[i+i+1]=nums[i+n];
			
		}
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(newArr[i]);
		}
        return nums;
    }

}
