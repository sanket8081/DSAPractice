package io.sanket8081.arrays;

import java.util.Scanner;

public class ArrayBasicOperations {

	public static void main(String[] args) {
		
		
		//Array Declaration
		int arr[];
		
		//array instantiation
		arr = new int[5];
		
		//array initialization
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		//declare,instantiation,initialization
		int arr2 [] = {10,20,30,40,50};
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a size of array : ");
		int size = sc.nextInt();
		int sampleArray[] = new int[size];
		//System.out.println("Enter array elements seperated by comma(,) : ");
		
		/*for (int i = 0; i < sampleArray.length; i++) {
			sampleArray[i] = sc.nextInt();
		}*/
		
		ArrayBasicOperations a = new ArrayBasicOperations();
		int res1 = a.insertValueInArray(sampleArray, 10, 0);
		if(res1<1)
			System.out.println("Location Already Occupied !!\n");
		
		a.TraverseArray(sampleArray);
		
		int res2 = a.AccessingGivenCell(sampleArray, 0);
		if(res2<1)
			System.out.println("Wrong Location!!\n");
		
		int res3 = a.searchValue(sampleArray, 10);
		if(res3<1)
			System.out.println("Value not found!!\n");
		
		int res4 = a.deleteValue(sampleArray, 0);
		if(res3<1)
			System.out.println("Value deleted\n");
		
		a.TraverseArray(sampleArray);
	}
	
	public int insertValueInArray(int arr[],int valueToBeInserted, int location)
	{
		if(arr[location] == Integer.MIN_VALUE)
		{
			return -1;
		}
		else
		{
			arr[location] =  valueToBeInserted;
			return 1;
		}
	}
	
	public void TraverseArray(int arr[])
	{
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public int AccessingGivenCell(int arr[],int location)
	{
		if(location>arr.length)
		{
			return -1;
		}
		else {
			System.out.println("The value at "+location+" location is "+arr[location]);
			return 1;
		}
	}
	
	public int searchValue(int arr[], int valueToBeSearched)
	{
		for (int i : arr) {
			if(i==valueToBeSearched)
			{
				System.out.println("Value found !!");
				return 1;
			}
		}
		return -1;
	}
	
	public int deleteValue(int arr[], int location)
	{
		if(location>arr.length)
		{
			return -1;
		}
		else if(arr[location] == Integer.MIN_VALUE)
		{
			return -1;
		}
		else {
			arr[location] = Integer.MIN_VALUE;
			return 1;
		}
	}
	

}
