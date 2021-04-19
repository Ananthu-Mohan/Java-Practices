package OOPS;
import java.util.*;
public class prg16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2; 
		StringBuffer finalString = new StringBuffer(); 
		int len1,len2;
		int i = 0, j = 0; 
		
		Scanner S=new Scanner(System.in);
		System.out.println("Enter first string  ");
		str1=S.nextLine();
		System.out.println("Enter second string  ");
		str2=S.nextLine();
		
		len1 = str1.length();
		len2 = str2.length();
		
		while ((i < len1) && (j < len2))
        { 

		    finalString.append(str1.charAt(i++)); 
		    finalString.append(str2.charAt(j++)); 
		} 	
		System.out.print(finalString);
	}

}
