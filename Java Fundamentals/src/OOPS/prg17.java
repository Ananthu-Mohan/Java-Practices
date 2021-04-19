package OOPS;

import java.util.*;

public class prg17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		String str1,str2;
		int len , n;
		System.out.println("Enter a string");
		str1 = S.next();
		System.out.println("Enter the value for n");
		n = S.nextInt();
		len = str1.length();
		str2 = str1.substring(len-n, len);
		for(int i=0;i<n;i++)
		{
			System.out.print(str2);
		}
	}

}
