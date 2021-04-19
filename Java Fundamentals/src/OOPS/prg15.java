package OOPS;
import java.util.*;
public class prg15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		String str1;
		int j = 0;
		int index,len;
		System.out.println("Enter a String");
		str1 = S.next();
		len = str1.length();
		char array1[] = new char[len];
		char array2[] = new char[len];
		array1 = str1.toCharArray();
		index = str1.indexOf('*');
		for(int i =0; i<=index-2;i++)
		{
			array2[i] = array1[i];
			j = i+1;
		}
		for(int i=index+2;i<len;i++)
		{
			array2[j++] = array1[i];
		}
		for(int i =0;i<len;i++)
		{
			System.out.print(array2[i]);
		}
	}

}
