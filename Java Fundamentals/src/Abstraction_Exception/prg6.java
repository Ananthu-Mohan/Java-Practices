package Abstraction_Exception;
import java.util.*;
public class prg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int limit,access;
		System.out.println("Enter the size of the array ");
		limit = S.nextInt();
		int a[] = new int[limit];
		System.out.println("Enter the array Elements ");
		for(int i =0;i<limit;i++)
		{
			try
			{
				a[i] = S.nextInt();
			}
			catch(Exception E)
			{
				System.out.println(E);
			}
		}
		System.out.println("Enter the index yout want to access ");
		access = S.nextInt();
		try
		{
			System.out.println("Element found at "+access+" = "+a[access]);
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
		
	}

}
