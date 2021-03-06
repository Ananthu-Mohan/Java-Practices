package extra;

public class CharacterOrSumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "1W2i3p4r5o6";
		int input2 = 1;
		int sum = 0;
		String alphabet ="";
		if(input2 ==0)
		{
			sum = SumDigits(input1);
			if(sum ==0)
			{
				System.out.println("ZERO");
			}
			else if(sum ==-1)
			{
				System.out.println("NULL");
			}
			else
			{
				System.out.println(sum);
			}
			
		}
		else
		{
			alphabet = alphaChars(input1);
			System.out.println(alphabet);
		}
	}
	public static int SumDigits(String str)
	{
		char ch ='\0';
		int sum = 0,key = 0;
		boolean flag=  true;
		if(str.length() ==0)
		{
			return -1;
		}
		else
		{
			for(int i=0;i<str.length();i++)
			{
				ch = str.charAt(i);
				if(Character.isDigit(ch))
				{
					key = str.charAt(i)-48;
					sum+=key;
				}
				else
				{
					flag = true;
				}
			}
			if((flag == true)&&(sum ==0))
			{
				sum =0;
			}
			return sum;
		}
	}
	public static String alphaChars(String str)
	{
		char ch='\0';
		String output ="";
		boolean flag = false;
		if(str.length() ==0)
		{
			output ="NULL";
		}
		else
		{
			for(int i=0;i<str.length();i++)
			{
				ch = str.charAt(i);
				if(Character.isLetter(ch))
				{
					output += Character.toString(ch);
				}
				else
				{
					flag = true;
				}
			}
			if((flag==true)&&(output.length()==0))
			{
				output ="ZERO";
			}
		}
		
		return output;
	}

}
