package OOPS;
import java.util.*;

public class prg9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2,str3=" ",str4,str5,str6,str7 ;
		int len1,len2,i,len3,j=0,k;
		char last,first;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter first string");
		str1 = S.next();
		System.out.println("Enter second string");
		str2 = S.next();
		len1 = str1.length();
		len2 = str2.length();
		len3 = len1 + len2;
		char array1[] = new char[len1];
		char array2[] = new char[len2];
		char array3[] = new char[len3];
		array1 = str1.toCharArray();
		array2 = str2.toCharArray();
		last = array1[array1.length-1];
		first = array2[0];
		if(last == first)
		{
			for(i=0;i<array1.length-1;i++)
			{
				array3[i] = array1[i];
				j = i+1;
			}
			for(k=0;k<array2.length;k++)
			{
				array3[j++] = array2[k];
			}
			for(i=0;i<array3.length;i++)
			{
				System.out.print(Character.toLowerCase(array3[i]));
			}
		}
		else
		{
			str4 = str1+str3; 
			str4 = str4.concat(str2);
			System.out.println(str4.toLowerCase());
		}
	}
}
