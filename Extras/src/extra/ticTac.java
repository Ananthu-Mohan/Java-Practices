package extra;

import java.util.*;
import java.util.Scanner;

public class ticTac {
	static int MAX_CHARS =256;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		String str = new String();
		System.out.println("Enter the String ");
		str = S.nextLine();
		str = str.toLowerCase();
		
		int first_index = str.indexOf(">");
		int last_index = str.indexOf("<",first_index);
		String sub = str.substring(first_index+1,last_index);
		
		String[] words = sub.split(" ");
		int count_words = 0,i=0;
		int flag = 1,prev = 0,temp =0;
		for(String s:words)
		{
			count_words++;
		}
		//System.out.println(count_words);
		
		sub = sub.replaceAll(" ","");
		//System.out.println(sub);
		int[]count = new int[MAX_CHARS];
		char ch ='\0';
		int key = 0;
		for(i=0;i<sub.length();i++)
		{
			ch = sub.charAt(i);
			key = (int)ch;
			count[key]++;
		}
		long number = 0;
		Arrays.sort(count);
		count[0] = count_words;
		StringBuffer sbuff = new StringBuffer();
		for(i =0;i<count.length;i++)
		{
			if(count[i]==0)
			{
				continue;
			}
			else
			{
				sbuff = sbuff.append(count[i]);
			}
		}
		//System.out.println(sbuff);
		number = Long.parseLong(sbuff.toString());
		System.out.println(number);
		
	}
	
}
