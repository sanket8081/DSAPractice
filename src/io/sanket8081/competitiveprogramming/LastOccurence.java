//https://www.hackerearth.com/practice/algorithms/searching/linear-search/tutorial/

package io.sanket8081.competitiveprogramming;

import java.util.Scanner;

public class LastOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        
        int numberOfElements = s.nextInt();
        int numberToBeSearched = s.nextInt();
        int position=-1;
        int arr[] = new int [numberOfElements];
        
        for(int i=0;i<numberOfElements;i++)
        {
        	arr[i]=s.nextInt();
        	if(numberToBeSearched==arr[i])
        		position=i;
        }
        System.out.println(position+1);
        
        
	}

}
