package Core_java;

import java.util.Scanner;
import java.lang.*;

public class amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int num;
		int i,j,k;
		int digit = 0;
		int rem,temp,temp_1; ;
		int sum =0;
		System.out.println("Enter a number ");
		num = S.nextInt();
		temp = num;
		temp_1 = num;
		for(i=0;temp!=0;i++)
		{
			rem = temp % 10;
			digit++;
			temp = temp / 10; 
		}
		rem = 0;
		//System.out.println(digit);
		for(j=0;num!=0;j++)
		{
			rem = num %10;
			sum = (int) (sum + Math.pow(rem,digit));
			num = num / 10;
		}
		if(temp_1 == sum)
		{
			System.out.print("Amstrong number");
		}
		else
		{
			System.out.print("Not a Amstrong number");
		}
	}

}
