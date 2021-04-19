package OOPS;
import java.util.*;
public class prg13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		String str1,str2,str3 = "",str4 = "";
		int len1, len2;
		System.out.println("Enter a string");
		str1 = S.next();
		System.out.println("Enter an another string");
		str2 = S.next();
		len1 = str1.length();
		len2 = str2.length();
		if(len1<len2)
		{
			str3 = str1+str2;
			str4 = str3+str1;
			System.out.println(str4);
		}
		else if(len2<len1)
		{
			str3 = str2+str1;
			str4 = str3+str2;
			System.out.println(str4);
		}
	}

}
