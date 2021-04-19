package Java_Fundamentals;

import java.util.Scanner;

public class prg23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the search number ");
		int x = S.nextInt();
		int f=0,i;
		int[] num = {1,4,34,56,7};
		for(i=0;i<num.length;i++)
		{
			if(x==num[i])
			{
				f=1;
				break;
			}
			else
			{
				f=0;
			}
			
		}
		if(f==1)
		{
			System.out.println("Present at "+i);
		}
		else
		{
			System.out.println("-1");
		}
	}

}
