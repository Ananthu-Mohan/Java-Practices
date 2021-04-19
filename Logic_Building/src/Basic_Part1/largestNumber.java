package Basic_Part1;

import java.util.*;

public class largestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int max = 0;
		int rem = 0;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a number");
		number  = S.nextInt();
		
		while(number!=0)
		{
			rem = number%10;
			if(rem>max)
			{
				max = rem;
			}
			number = number/10;
		}
		System.out.println(max);
	}

}
