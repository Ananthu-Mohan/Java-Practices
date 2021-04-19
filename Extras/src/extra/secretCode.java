package extra;
import java.util.*;
public class secretCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		String str = new String();
		int upperCount = 0;
		int input1,input2,input3;
		System.out.println("Enter the String ");
		str = S.next();
		System.out.println("Enter the number 1 ");
		input1 = S.nextInt();
		System.out.println("Enter the number 2 ");
		input2 = S.nextInt();
		System.out.println("Enter the number 3 ");
		input3 = S.nextInt();
	
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				upperCount++;
			}
		}
		System.out.println("UpperCase Letter Count = "+upperCount);
		
		int[]number = new int[] {input1,input2,input3};
		
		int[]max = new int[number.length];
		int[]secondMax = new int[number.length];
		for(int i=0;i<number.length;i++)
		{
			max[i] = largest(number[i]);
			secondMax[i] = secondlargest;
		}
		
		System.out.println("Largest ");
		for(int i=0;i<max.length;i++)
		{
			System.out.print(max[i]+"\t");
		}
		
		System.out.println();
		System.out.println("Second Largest ");
		for(int i=0;i<max.length;i++)
		{
			System.out.print(secondMax[i]+"\t");
		}
		
		int Pin = ((max[0]*secondMax[0])+(max[1]*secondMax[1])-(max[2]*secondMax[2]))*upperCount;
		System.out.println();
		System.out.println("Pin = "+Pin);	
		
	}
	public static int largest(int number)
	{
		int temp = number;
		int rem = 0,max= 0,index=0,no=0;
		String str="",str_max="";
		while(temp!=0)
		{
			rem = temp%10;
			if(rem>max)
			{
				max = rem;
			}
			temp /=10;
		}
		//We Use String methods to delete the largest number from the number adn passing that number to find the second largest
		str = String.valueOf(number);
		str_max = String.valueOf(max);
		StringBuffer sbuff = new StringBuffer(str);
		index = sbuff.indexOf(str_max);
		sbuff = sbuff.deleteCharAt(index);
		no = Integer.parseInt(sbuff.toString());
		
		secondLarge(no);
		return  max;
		
	}
	public static void secondLarge(int no)
	{
		int temp = no;
		int rem = 0,max2=0;
		temp = no;
		while(temp!=0)
		{
			rem = temp%10;
			if(rem>max2)
			{
				max2 = rem;
			}
			temp /=10;
		}
		secondlargest = max2;
	}
	static int secondlargest = 0;
}
