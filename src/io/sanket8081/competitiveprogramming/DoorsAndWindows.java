/*
 * A shop has 5 doors and 6 windows each having a serial number starting from 1.
 * In an automated system , user can either open or close each door and window.
 * Each operations performed on door takes 50 secs and on windows take 60 secs.
 * Write an algorithm to ask the user for which operation to perform on which object 
 * and then display the serial number of the object along with the total duration of 
 * operation performed on it*/

package io.sanket8081.competitiveprogramming;

import java.util.Scanner;

public class DoorsAndWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] doors = new int[5];
		int[] windows = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		int runloop = 1;
		while(runloop==1)
		{
			System.out.println("Which operation? (d/D -> Door , w/W -> Window)");
			String operation = sc.next();
			
			if(operation.toLowerCase().equals("d"))
			{
				System.out.println("Enter door number (1-5) :");
				int door= sc.nextInt();
				if(door >=1 && door <=6)
				{
					doors[door-1]+=50;
					int totalDoorDuration = doors[door-1];
					System.out.println("Door "+door+" was opened "+totalDoorDuration/50+" times and total time taken to pereform this operations was  "+totalDoorDuration+" secs.");
				}
				else
					System.out.println("Enter correct door number!");
			}
			else if(operation.toLowerCase().equals("w"))
			{
				System.out.println("Enter window number (1-6) :");
				int window= sc.nextInt();
				if(window>=1 && window <=6)
				{	
					windows[window-1]+=60;
					int totalWindowDuration = windows[window-1];
					System.out.println("Window "+window+" was opened "+totalWindowDuration/60+" times and total time taken to pereform this operations was  "+totalWindowDuration+" secs.");
				}
				else
					System.out.println("Enter correct window number!");
			}
			
			System.out.println("Do you want to continue? (1-YES,0-NO)");
			runloop=sc.nextInt();
		}
		
	}

}
