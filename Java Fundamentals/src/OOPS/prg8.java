package OOPS;

import java.util.Scanner;

public class prg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,temp;
		String str1="";
		int len,i;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the string ");
		str = S.next();
		temp = str;
		len = str.length();
		for(i = len;i>=0;i--)
		{
			str1 = str;
		}
		if(str1.equalsIgnoreCase(temp))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
