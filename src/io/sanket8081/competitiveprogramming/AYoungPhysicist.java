package io.sanket8081.competitiveprogramming;

import java.util.Scanner;

public class AYoungPhysicist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int x,y,z;
		int xsum=0,ysum=0,zsum=0;
		for(int counter1=0;counter1<number;counter1++)
		{
			x=sc.nextInt();
			y=sc.nextInt();
			z=sc.nextInt();
			xsum+=x;
			ysum+=y;
			zsum+=z;
		}
		sc.close();
		if(xsum==0&&ysum==0&&zsum==0)
		{
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
	}

}
