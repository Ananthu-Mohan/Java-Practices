package classdemo;

import java.util.*;

public class remove1digit {
	public static boolean isPalindrome(int number)
	{
		int rem = 0;
		int rev = 0;
		int temp = number;
		while(number!=0)
		{
			rem = number % 10;
			rev = rev*10+rem;
			number = number/10;
		}
		if(temp == rev)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1,temp;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a number");
		input1 = S.nextInt();
		temp = input1;
		boolean hold;
		char removed=' '; 
		int flag = 0;
		StringBuffer number = new StringBuffer(String.valueOf(input1));
		for(int i =0;i<number.length();i++)
		{
			if(isPalindrome(input1))
			{
				flag = 1;

			}
			else
			{
				removed = number.charAt(i);
				String new_str = number.deleteCharAt(i).toString();
				int rem_number = Integer.parseInt(new_str);
				input1 = rem_number;
			}
		}
		if(flag == 1)
		{
			System.out.println("Palindrom = "+input1);
		}
		System.out.println("Removed Value = "+removed);
		
		
	}

}
