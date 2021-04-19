package extra;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class lpfpVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int input2;
		System.out.println("Enter the size of the string array");
		input2 = S.nextInt();
		String[] str = new String[input2];
		for(int i=0;i<input2;i++)
		{
			System.out.println("Enter the string to "+i+"th value including ','");
			str[i] = S.next();
		}
		
		StringBuffer sbuff = new StringBuffer();
		char[] vowels =new char[] {'a','e','i','o','u'};
		char first ='\0';
		char last ='\0';
		boolean flag_first =false,flag_last=false,out = true,flag = false;
		for(String s:str)
		{
			int len =s.length();
			first = s.charAt(0);
			last = s.charAt(len-1);
			for(int i=0;i<vowels.length;i++)
			{
				if(first==vowels[i])
				{
					flag_first=true;
					break;
				}
			}
			for(int j=0;j<vowels.length;j++)
			{
				if(last==vowels[j])
				{
					flag_last=true;
					break;
				}
			}
			if((flag_first==true)&&(flag_last==true))
			{
				flag_first =false;
				flag_last=false;
				sbuff = sbuff.append(s);
				flag = false;
			}
			else
			{
				flag = true;
			}
		}
		if(sbuff.length()==0)
		{
			System.out.println("No values");
		}
		else
		{
			System.out.println(sbuff);
		}

	}

}
