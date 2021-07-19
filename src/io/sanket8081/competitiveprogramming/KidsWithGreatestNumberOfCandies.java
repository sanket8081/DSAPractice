//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

package io.sanket8081.competitiveprogramming;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Boolean> res = new ArrayList<Boolean>();
		 int []candies = {2,3,5,1,3};
		 
		 KidsWithGreatestNumberOfCandies k = new KidsWithGreatestNumberOfCandies();
		 res = k.kidsWithCandies(candies, 3);
		 for (boolean i : res) {
			 System.out.println(i);
			
		}
	}
	
	 public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	        
	        int maxCandies = candies[0];
	        List<Boolean> greatestNumberOfCandies = new ArrayList<Boolean>();
	        for(int counter = 0;counter<candies.length;counter++)
	        {
	            if(maxCandies<candies[counter])
	                maxCandies = candies[counter];
	        }
	        for(int counter2=0;counter2<candies.length;counter2++)
	        {
	            int noOfCandies = candies[counter2] + extraCandies;
	            if(noOfCandies>=maxCandies)
	                greatestNumberOfCandies.add(true);
	            else
	                greatestNumberOfCandies.add(false);
	        }
	        return greatestNumberOfCandies;
	    }

}
