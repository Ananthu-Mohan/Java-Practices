package classdemo;

public class largestNsecond {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1=4079,input2=5028,input3=9119,upperCount=0;
		
		String str = "WipRo";
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
