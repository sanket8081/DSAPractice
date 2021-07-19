//https://leetcode.com/problems/number-of-good-pairs/ 
package io.sanket8081.competitiveprogramming;

public class NumberOfGoodPairs {

	public static void main(String[] args) {
		int arr[] = {1,2,3,1,1,3};
		NumberOfGoodPairs n = new NumberOfGoodPairs();
		int res=n.numIdenticalPairs(arr);
		System.out.println(res);
		
	}
	
	public int numIdenticalPairs(int[] nums) {
		
		 
		
		 int noOfPairs=0;
		 int freq[] =new int[101];
		 
		 for(int i:nums)
		 {
			 if(freq[i]==0)
			 {
				 freq[i]+=1;
			 }
			 else {
				 noOfPairs +=freq[i];
				 freq[i]+=1;
				 
			 }
		 }
	     return noOfPairs;
	     
	 }
	
//	 public int numIdenticalPairs(int[] nums) {
//		 
//		 if(nums.length==1)
//			 return 0;
//		 int noOfPairs=0;
//		 for(int counter1=0;counter1<nums.length;counter1++)
//		 {
//			 for(int counter2=counter1+1;counter2<nums.length;counter2++)
//			 {
//				 if(nums[counter1]==nums[counter2] && counter1<counter2)
//				 {
//					 noOfPairs++;
//				 }
//			 }
//		 }
//	     return noOfPairs;
//	     
//	 }
}
