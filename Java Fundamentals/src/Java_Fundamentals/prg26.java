package Java_Fundamentals;

public class prg26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {5,6,8,7,3,1,2};
		int temp,i,j;
		for(i=0;i<num.length;i++)
		{
			for(j=i+1;j<num.length;j++)
			{
				if(num[j]<num[i])
				{
					temp = num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		for(i=0;i<num.length;i++)
		{
			System.out.print(num[i]+"\t");
		}
	}

}
