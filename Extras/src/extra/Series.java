package extra;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []input1 = {100,90,80,70,0,50,40,30,20};
		int len = input1.length;
		int div = 0,multiply=0;
		if(input1[1]>input1[0])
		{
			if(input1[1]%input1[0]==0)
			{
				div = input1[1]/input1[0];
				for(int i=0;i<len;i++)
				{
					if(input1[i]==0)
					{
						break;
					}
					multiply=input1[i]*div;
				}
				System.out.println(multiply);
			}
			else
			{
				div = input1[1]%input1[0];
				for(int i=0;i<len;i++)
				{
					if(input1[i]==0)
					{
						break;
					}
					multiply=input1[i]-div;
				}
				System.out.println(multiply);
			}
		}
		else
		{
			if(input1[0]%input1[1]==0)
			{
				div = input1[0]/input1[1];
				for(int i=0;i<len;i++)
				{
					if(input1[i]==0)
					{
						break;
					}
					multiply=input1[i]*div;
				}
				System.out.println(multiply);
			}
			else
			{
				div = input1[0]%input1[1];
				for(int i=0;i<len;i++)
				{
					if(input1[i]==0)
					{
						break;
					}
					multiply=input1[i]-div;
				}
				System.out.println(multiply);
			}
		}
	}

}
