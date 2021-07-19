package io.sanket8081.arrays;

import java.util.Scanner;

public class MutltiDimensionalArrayOperations {

public static void main(String[] args) {
		
		
		//Array Declaration
		int arr[][];
		
		//array instantiation
		arr = new int[2][3];
		
		//array initialization
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		
		
		//declare,instantiation,initialization
		int arr2 [][] = {{10,20,30},{40,50,60}};
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter no. of rows and columns : ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int sampleArray[][] = new int[rows][cols];
		
		MutltiDimensionalArrayOperations a = new MutltiDimensionalArrayOperations();
		
		int res1 = a.insertValueInArray(sampleArray, 10, 0,0);
		if(res1<1)
			System.out.println("Location Already Occupied !!\n");
		
		a.TraverseArray(sampleArray);
		
		int res2 = a.AccessingGivenCell(sampleArray, 0 ,0);
		if(res2<1)
			System.out.println("Wrong Location!!\n");
		
		int res3 = a.searchValue(sampleArray, 10);
		if(res3<1)
			System.out.println("Value not found!!\n");
		
		int res4 = a.deleteValue(sampleArray, 0,0);
		if(res4<1)
			System.out.println("Empty cell or Incorrect row and col value \n");
		
		a.TraverseArray(sampleArray);
	}
	
	public int insertValueInArray(int arr[][],int valueToBeInserted, int row,int col)
	{
		if(arr[row][col] == Integer.MIN_VALUE)
		{
			return -1;
		}
		else
		{
			arr[row][col] =  valueToBeInserted;
			return 1;
		}
	}
	
	public void TraverseArray(int arr[][])
	{
		int rows = arr.length;
		int cols = arr[0].length;
		
		for (int row = 0; row < arr.length; row++) {
			
			for (int col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col]+"\t");
			}
			System.out.println("\n");
		}
		
	}
	
	public int AccessingGivenCell(int arr[][],int row,int col)
	{
		if(row>=arr.length || col>=arr[0].length)
		{
			return -1;
		}
		else {
			System.out.println("The value at "+row+","+col+" location is "+arr[row][col]);
			return 1;
		}
	}
	
	public int searchValue(int arr[][], int valueToBeSearched)
	{
		for (int row = 0; row < arr.length; row++) {
			
			for (int col = 0; col < arr[0].length; col++) {
				if(arr[row][col]==valueToBeSearched)
				{
					System.out.println("Value found!!\n");
					return 1;
				}
			}
			
		}
			
		
		return -1;
	}
	
	public int deleteValue(int arr[][], int row, int col)
	{
		if(row>=arr.length || col>=arr[0].length)
		{
			return -1;
		}
		else if(arr[row][col] == Integer.MIN_VALUE)
		{
			return -1;
		}
		else {
			arr[row][col] = Integer.MIN_VALUE;
			System.out.println("Value deleted!!\n");
			return 1;
		}
	}

}
