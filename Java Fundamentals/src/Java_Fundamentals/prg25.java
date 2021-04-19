package Java_Fundamentals;

import java.util.Scanner;

public class prg25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		System.out.print("Enter no. of elements ");
        int n = scn.nextInt();
		int array[] = new int[n];
        System.out.println("Enter the elements:");
		for (int i = 0; i < array.length; i++)
		{
			array[i] = scn.nextInt();
        }
        //Largest
		int largest1, largest2, temp;
		largest1 = array[0];
		largest2 = array[1]; 
		if (largest1 < largest2)
		{
			temp = largest1;
			largest1 = largest2;
			largest2 = temp;
        }
		for (int i = 2; i < array.length; i++)
		{
			if (array[i] > largest1)
			{
				largest2 = largest1;
				largest1 = array[i];
			}
			else if (array[i] > largest2 && array[i] != largest1)
			{
				largest2 = array[i];
			}
		}
        System.out.println ("The Second largest is " + largest2);
        
        //smallest

        int smallest1, smallest2, temp2;
		smallest1 = array[0];
		smallest2 = array[1]; 
		if (smallest1 > smallest2)
		{
			temp2 = smallest1;
			smallest1 = smallest2;
			smallest2 = temp2;
		}
		for (int i = 2; i < array.length; i++)
		{
			if (array[i] < smallest1)
			{
				smallest2 = smallest1;
				smallest1 = array[i];
			}
			else if (array[i] < smallest2 && array[i] != smallest1)
			{
				smallest2 = array[i];
			}
		}
		System.out.println ("The Second smallest is " + smallest2);
	}

}
