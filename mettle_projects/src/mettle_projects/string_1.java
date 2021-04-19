package mettle_projects;

import java.util.*;
public class string_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int len1,len2,len3;
		
		int div_no_1,div_no_2,div_no_3;
		
		int i,j,k,l,m,n;
		
		String str1 = new String();
		String str2 = new String();
		String str3 = new String();
		
		System.out.println("Enter the first String");
		str1 = S.next();
		System.out.println("Enter the second String");
		str2 = S.next();
		System.out.println("Enter the third String");
		str3 = S.next();
		
		len1 = str1.length();
		len2 = str2.length();
		len3 = str3.length();
		
		String front_1 = new String();
		String middile_1 = new String();
		String end_1 = new String();
		
		String front_2 = new String();
		String middile_2 = new String();
		String end_2 = new String();
		
		String front_3 = new String();
		String middile_3 = new String();
		String end_3 = new String();
		
		String output1 = new String();
		String output2 = new String();
		String output3 = new String();
		
		if(len1%3==0)
		{
			div_no_1 = len1/3;
			front_1 = str1.substring(0, 0+div_no_1);
			//System.out.println(front_1);
			middile_1 = str1.substring(div_no_1,div_no_1*2);
			//System.out.println(middile_1);
			end_1 = str1.substring(div_no_1*2,div_no_1*3);
			//System.out.println(end_1);
			
		}
		else if(len1%3==1)
		{
			div_no_1 = len1/3;
			front_1 = str1.substring(0,div_no_1);
			System.out.println(front_1);
			middile_1 = str1.substring(div_no_1,len1-div_no_1);
			System.out.println(middile_1);
			end_1 = str1.substring(len1-div_no_1,len1);
			System.out.println(end_1);
			
		}
		else if(len1%3==2)
		{
			div_no_1 = (len1/3)+1;
			front_1 = str1.substring(0,div_no_1);
			System.out.println(front_1);
			middile_1 = str1.substring(div_no_1,len1-div_no_1);
			System.out.println(middile_1);
			end_1 = str1.substring(len1-div_no_1, len1);
			System.out.println(end_1);
		}
		
		//second string
		if(len2%3==0)
		{
			div_no_2 = len2/3;
			front_2 = str2.substring(0, 0+div_no_2);
			//System.out.println(front_2);
			middile_2 = str2.substring(div_no_2,div_no_2+div_no_2);
			//System.out.println(middile_2);
			end_2 = str2.substring(div_no_2+div_no_2,div_no_2+div_no_2+div_no_2);
			//System.out.println(end_2);
		}
		else if(len2%3==1)
		{
			div_no_2 = len2/3;
			front_2 = str2.substring(0,div_no_2);
			//System.out.println(front_2);
			middile_2 = str2.substring(div_no_2,len2-div_no_2);
			//System.out.println(middile_2);
			end_2 = str2.substring(len2-div_no_2,len2);
			//System.out.println(end_2);
		}
		else if(len2%3==2)
		{
			div_no_2 = (len2/3)+1;
			front_2 = str2.substring(0,div_no_2);
			//System.out.println(front_2);
			middile_2 = str2.substring(div_no_2,len2-div_no_2);
			//System.out.println(middile_2);
			end_2 = str2.substring(len2-div_no_2, len2);
			//System.out.println(end_2);
		}
		
		//third string
		if(len3%3==0)
		{
			div_no_3 = len3/3;
			//front_3 = str3.substring(0, 0+div_no_3);
			System.out.println(front_3);
			//middile_3 = str3.substring(div_no_3,div_no_3+div_no_3);
			System.out.println(middile_3);
			end_3 = str3.substring(div_no_3+div_no_3,div_no_3+div_no_3+div_no_3);
			//System.out.println(end_3);
		}
		else if(len3%3==1)
		{
			div_no_3 = len3/3;
			front_3 = str3.substring(0,div_no_3);
			//System.out.println(front_3);
			middile_3 = str3.substring(div_no_3,len3-div_no_3);
			//System.out.println(middile_3);
			end_3 = str3.substring(len3-div_no_3,len3);
			//System.out.println(end_3);
		}
		else if(len3%3==2)
		{
			div_no_3 = (len3/3)+1;
			front_3 = str3.substring(0,div_no_3);
			//System.out.println(front_3);
			middile_3 = str3.substring(div_no_3,len3-div_no_3);
			//System.out.println(middile_3);
			end_3 = str3.substring(len3-div_no_3, len3);
			//System.out.println(end_3);
		}
		output1 = front_1+end_2+middile_3;
		output2 = middile_1+front_2+end_3;
		output3 = end_1+middile_2+front_3;
		System.out.println("Output1 = "+output1);
		System.out.println("Output2 = "+output2);
		System.out.println("Output3 = "+output3.toUpperCase());
		
	}

}
