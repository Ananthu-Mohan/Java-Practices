package classdemo;


import java.util.*;

public class passString {
	

	public int password(int num1,int num2,int num3,int num4,int num5)
	{
		
		int stable_sum = 0;
		int unstable_sum = 0;
		int pass = 0;
		
		int [] array = new int[] {num1,num2,num3,num4,num5};
		
		for(int i=0;i<array.length;i++)
		{
			if(isStable(array[i])==true)
			{
				stable_sum = stable_sum + array[i];
			}
			else
			{
				unstable_sum = unstable_sum + array[i];
			}
		}
		pass = stable_sum - unstable_sum;
		return pass;
		
	}
	
	public boolean isStable(int temp)
	{
		int [] c = new int[] {0,0,0,0,0,0,0,0,0,0};
		int n=0;
		int rem = 0;
		while(temp!=0)
		{
			rem = temp%10;
			c[rem]= c[rem]+1;
			temp = temp/10;
		}
		for(int i = 0;i<c.length;i++)
		{
			if(c[i]!=0)
			{
			
				if(n==0)
				{
					n = c[i];
				}
				else if(n != c[i])
				{
					return false;
				}
			}
			
			
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int input1,input2,input3,input4,input5;
		int result;
		System.out.println("Enter input1");
		input1 = S.nextInt();
		System.out.println("Enter input2");
		input2 = S.nextInt();
		System.out.println("Enter input3");
		input3 = S.nextInt();
		System.out.println("Enter input4");
		input4 = S.nextInt();
		System.out.println("Enter input5");
		input5 = S.nextInt();
		
		passString p = new passString();
		result = p.password(input1,input2,input3,input4,input5);
		System.out.println(Math.abs(result));
		
	}

}
