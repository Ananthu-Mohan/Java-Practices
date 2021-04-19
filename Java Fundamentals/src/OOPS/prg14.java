package OOPS;
import java.util.*;
public class prg14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int len;
		String str1,str2;
		char first,last;
		System.out.println("Enter the string");
		str1 = S.next();
		len = str1.length();
		char array1[] = new char[len];
		first = str1.charAt(0);
		last = str1.charAt(len-1);
		array1 =str1.toCharArray();
		if((first == 'x')&&(last == 'x')) 
		{
			for(int i = 1;i<len-1;i++)
			{
				System.out.print(array1[i]);
			}
		}
		else
		{
			System.out.println(str1);
		}
	}

}
