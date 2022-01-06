package io.sanket8081.competitiveprogramming;

public class PalindromeNumber {

public boolean isPalindrome(int x) {
        
        //BruteForce approach
        int tempx=x,tempy=x,counterx=0,countery=0;
        int[] nums;
        
        if(x<0)
            return false;
        else{
            
            while(tempx!=0)
            {
                int rem=tempx%10;
                tempx = tempx/10;
                counterx++;
            }
            nums = new int[counterx];
            
            //System.out.println("Nums length"+nums.length);
            
            while(tempy!=0)
            {
                int rem=tempy%10;
                tempy = tempy/10;
                nums[countery]=rem;
                countery++;
            }
            
            for(int i=0,j=nums.length-1;i<nums.length && j>=i ;i++,j--)
            {
                //System.out.println("nums[i]"+nums[i]+"\n");
                //System.out.println("nums[j]"+nums[j]+"\n");
                if(nums[i]!=nums[j])
                {
                    return false;
                }
            }
            return true;
        }
        
        //Optimised approach with some maths
        /*int sum = 0;
        for(int i = x; i > 0; i /= 10 )
            sum = sum*10 + (i%10);
        if(sum == x)
            return true;
        else
            return false;
        */
    }
}
