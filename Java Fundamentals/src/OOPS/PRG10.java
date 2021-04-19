package OOPS;
import java.util.*;
public class PRG10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		String str1,str2;
		int len;
		System.out.println("Enter the String");
		str1 = S.next();
		str2 = str1.substring(0, 2);
		len = str1.length();
		for(int i=0;i<len;i++)
		{
			System.out.print(str2);
		}
	}

}
