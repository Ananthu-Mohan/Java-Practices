package extra;

public class Extraction_Matching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 ="Wipro";
		String input2 ="Technologies";
		int input3 =1;
		int input4 =1;
		String output="";
		if(input3 ==0)
		{
			output = DonotOccur(input1,input2);
			if(input4 == 0)
			{
				output = output.toLowerCase();
			}
			else
			{
				output = output.toUpperCase();
			}
		}
		else
		{
			output = DoOccur(input1,input2);
			if(input4 == 0)
			{
				output = output.toLowerCase();
			}
			else
			{
				output = output.toUpperCase();
			}
		}
		System.out.println(output);
	}
	public static String DonotOccur(String str1,String str2)
	{
		String output="";
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		char array1[] = str1.toCharArray();
		char array2[] = str2.toCharArray();
		boolean flag = false;
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++)
			{
				if(array1[i] !=array2[j])
				{
					flag = true;
				}
				else
				{
					flag = false;
					break;
				}
			}
			if(flag == true)
			{
				output+=Character.toString(array1[i]);
			}
		}
		
		
		
		for(int i=0;i<array2.length;i++)
		{
			for(int j=0;j<array1.length;j++)
			{
				if(array2[i] !=array1[j])
				{
					flag = true;
				}
				else
				{
					flag = false;
					break;
				}
			}
			if(flag == true)
			{
				output+=Character.toString(array2[i]);
			}
		}
		
		
		return output;
	}
	public static String DoOccur(String str1,String str2)
	{
		String output="",output1="",output2="";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		char array1[] = str1.toCharArray();
		char array2[] = str2.toCharArray();
		boolean flag = false;
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++)
			{
				if(array1[i] ==array2[j])
				{
					flag = true;
					break;
				}
				else
				{
					flag = false;
				}
			}
			if(flag == true)
			{
				output1+=Character.toString(array1[i]);
			}
		}
		
		
		for(int i=0;i<array2.length;i++)
		{
			for(int j=0;j<array1.length;j++)
			{
				if(array2[i] ==array1[j])
				{
					flag = true;
					break;
				}
				else
				{
					flag = false;
				}
			}
			if(flag == true)
			{
				output2+=Character.toString(array2[i]);
			}
		}
		output = output1+output2;
		return output;
	}
}
