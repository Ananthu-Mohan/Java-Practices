package Java_Fundamentals;

public class prg22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {5,4,3,2,1};
		int small,big;
		small = num[0];
		big = num[0];
		for(int i=0;i<num.length;i++)
		{
			if(small>num[i])
			{
				small = num[i];
			}
			if(big<num[i])
			{
				big = num[i];
			}
		}
		System.out.println("Small = "+small+"\n"+"Big = "+big);
	}

}
