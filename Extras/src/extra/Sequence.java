package extra;

public class Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "i*-t5s-t8h1e4birds";
		int len = input1.length();
		char[] operators = {'+','-','/','*'};
		StringBuffer digits = new StringBuffer();
		StringBuffer parsed_operators = new StringBuffer();
		for(int i=0;i<input1.length();i++)
		{
			if(Character.isDigit(input1.charAt(i)))
			{
				digits = digits.append(input1.charAt(i));
			}
			else
			{
				for(int j=0;j<operators.length;j++)
				{
					if((input1.charAt(i))==(operators[j]))
					{
						parsed_operators = parsed_operators.append(input1.charAt(i));
					}
				}
			}
		}
		System.out.println("Digits");
		System.out.print(digits);
		System.out.println();
		System.out.println("Operators");
		System.out.print(parsed_operators);
		String str = digits.toString();
		int number = (int)str.charAt(0)-48;
		int sum = 0,j=0,number2=0;
		char operator ='\0';
		for(int i=1;i<str.length();i++)
		{
			number2 = (int)str.charAt(i)-48;
			operator = parsed_operators.charAt(i-1);
			switch(operator)
			{
				case '+':
						sum =number+number2;
						number = sum;
						break;
				case '-':
						sum = number-number2;
						number = sum;
						break;
				case '/':
						sum = number/number2;
						number = sum;
						break;
				case '*':
						sum = number*number2;
						number = sum;
						break;
			}
		}
		System.out.println();
		System.out.println(sum);
	}

}
