package OOPS;

import java.util.Scanner;

public class prg12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		String str1,str2;
		int len;
		System.out.println("Enter the String");
		str1 = S.next();
		len = str1.length();
		char array1[] = new char[len];
		array1 = str1.toCharArray();
		for(int i = 1;i<len-1;i++)
		{
			System.out.print(array1[i]);
		}

	}

}
