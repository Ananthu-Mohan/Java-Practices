package Basic_Part1;

import java.util.*;

public class count_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		String input1 = new String();
		System.out.println("Enter the string ");
		input1 = S.nextLine();
		String str = input1;
		//System.out.println(str);
		String sub = null;
		char ch = '\0';
		int len = 0;
		int sum = 0;
		int j = 0;
		int total = 0,rem;
		/*String[] arr = input1.split(" ");
		for(String s:arr)
		{
			len = s.length();
			System.out.println(s + " "+len);
			sum += len;
		}*/
		for(int i=0;i<str.length();i++)
		{
			ch = str.charAt(i);
			if(ch == ' ')
			{
				sub = str.substring(j,i);
				j = i + 1;
				len = sub.length();
				System.out.println(sub + " "+len);
				sum += len;
			}
		}
		sub = str.substring(j,str.length());
		System.out.println(sub + " "+len);
		System.out.println(sum);
		if(sum>=10&&sum<=99)
		{
			rem = sum %10;
			sum = sum / 10;
			total = rem + sum;
		}
		System.out.println(total);
	}

}
