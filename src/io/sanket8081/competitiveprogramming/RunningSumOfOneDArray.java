//https://leetcode.com/problems/running-sum-of-1d-array/


package io.sanket8081.competitiveprogramming;

public class RunningSumOfOneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunningSumOfOneDArray r = new RunningSumOfOneDArray();
		int arr[] = {1,2,3};
		int [] res = r.runningSum(arr);
		for(int counter3=0;counter3<res.length;counter3++)
        {
            System.out.print(res[counter3]+"\t");
        }
	}
	public int[] runningSum(int[] nums) {
        int arrLength = nums.length;
        int []runningSum = new int[arrLength];
        for(int counter1=0;counter1<arrLength;counter1++)
        {
            int temp=0;
            for(int counter2=counter1;counter2>=0;counter2--)
            {
                
                temp+=nums[counter2];
                
            }
            runningSum[counter1] = temp;
            
        }
        
        String str ="abc.";
        str.replaceAll(".", "[.]");
        return runningSum;
        
    }
	
}
