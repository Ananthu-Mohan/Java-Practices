package mettle_projects;

import java.util.*;
public class string_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		String input1 = new String();
		System.out.println("Enter the string with ':' ");
		input1 = S.next();
		char ch1='\0';
		char ch2 = '\0';
		StringBuffer output = new StringBuffer();
		int position1 = 0,position2=0;
		int diff;
		char value ='\0';
		input1 = input1.toUpperCase();
		String[] words = input1.split(":");
		for(String s:words)
		{
			ch1 = s.charAt(0);
			ch2 = s.charAt(1);
			if(ch1 != ch2)
			{
				position1 = (int)ch1-64;
				position2 = (int)ch2-64;
				if(position1>position2)
				{
					diff = position1-position2;
					value = (char)(diff+64);
					//System.out.println(value);
					output = output.append(value);
				}
				else
				{
					diff = position2-position1;
					value = (char)(diff+64);
					//System.out.println(value);
					output = output.append(value);
				}
			}
			else
			{
				output = output.append(ch1);
			}
		}
		System.out.print(output);
	}

}
