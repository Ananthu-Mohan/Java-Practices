package Basic_Part1;
import java.util.*;

public class stringprg1 {

	public String generator(String in1,String in2,int pin,int num)
	{
		
		int len1 = in1.length();
		int len2 = in2.length();
		String smaller,longer;
		int rem =0;
		char ch1 = in1.charAt(0);
		char ch2 = in2.charAt(0);
		int rev[] = new int[10];
		int array1 [] = new int[10];
		
		if(len1<len2)
		{
			smaller = in1;
			longer = in2;
		}
		else if(len2<len1)
		{
			smaller = in2;
			longer = in1;
		}
		else
		{
			if(ch1<ch2)
			{
				smaller = in1;
				longer = in2;
			}
			else
			{
				smaller = in2;
				longer = in1;
			}
		}
		
		
		int i = 0;
		while(pin!=0)
		{
			rem = pin%10;
			rev[i] = rem;
			pin = pin/10;
			i++;
		}
		int j = 0;
		for(i=rev.length-1;i>=0;i--)
		{
			array1[j] = rev[i];
			j++;
		}
		
		String pos = array1.toString();
		return pos;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringprg1 p = new stringprg1();
		Scanner S = new Scanner(System.in);
		String in1,in2;
		int pin,num;
		System.out.println("Enter a name");
		in1 =S.next();
		System.out.println("Enter a name");
		in2 =S.next();
		System.out.println("Enter a pin");
		pin =S.nextInt();
		System.out.println("Enter a number");
		num =S.nextInt();
		String result = p.generator(in1, in2, pin, num);
		System.out.println(result);
	}

}
