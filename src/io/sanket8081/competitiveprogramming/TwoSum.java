package io.sanket8081.competitiveprogramming;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        /*
        //Brute-Force approach
        int counterx,countery;
        for(counterx=0;counterx<nums.length;counterx++)
        {
            for(countery=counterx+1;countery<nums.length;countery++)
            {
                if((nums[counterx]+nums[countery])==target)
                {
                    result[0]=counterx;
                    result[1]=countery;
                }
            }
        }
        
        return result;*/
        //Optimised solution using Map with O(n) time and space complexity
        Map<Integer,Integer> idsMap = new HashMap();
        
        for(int counterx=0;counterx<nums.length;counterx++)
        {
            int netTarget = target - nums[counterx];
            
            if(idsMap.containsKey(netTarget))
            {
                result[0]=counterx;
                result[1]=idsMap.get(netTarget);
                
                return result;
            }
            else{
                idsMap.put(nums[counterx],counterx);
            }
        }
        return result;
    }
}