package extra;

public class sumOfPrimeDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = 1234561179;
		String number = Integer.toString(input1);
		char[] prime = new char[] {'2','3','5','7'};
		String calPrime ="";
		int j = 0,sum=0,key=0;
		char ch ='\0';
		boolean flag = false;
		for(int i=0;i<number.length();i++)
		{
			ch = number.charAt(i);
			for(j=0;j<prime.length;j++)
			{
				if(ch == prime[j])
				{
					calPrime +=ch;
				}
				else
				{
					flag = true;
				}
			}
		}
		//System.out.println("Prime number = "+calPrime);
		if((flag == true)&&(calPrime.length()==0))
		{
			int first = (int)number.charAt(0)-48;
			int last = (int)number.charAt(number.length()-1)-48;
			System.out.println(first+":"+last);
		}
		else
		{
			int output1 = Integer.parseInt(calPrime);
			for(int i=0;i<calPrime.length();i++)
			{
				key = (int)calPrime.charAt(i)-48;
				sum +=key;
			}
			//System.out.println("Sum = "+sum);
			
			System.out.println(output1+":"+sum);
		}

	}
}
