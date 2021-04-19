package Java_Fundamentals;

import java.util.Scanner;

public class prg28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[7];
		int[] sum = new int[7];
		Scanner S = new Scanner(System.in);
		System.out.println("Enter array Elements:");
		int i,j,k=0,z=0,p;
		int temp;
		int total = 0;
		for(i=0;i<7;i++)
		{
			num[i] = S.nextInt();
		}
		for(i=0;i<7;i++)
		{
			if(num[i]==7)
			{
				k = i;
			}
		}
		for(i=0;i<7;i++)
		{
			
			if((num[i]==6))
				{
					if(i<k)
					{
						for(j=i;j<=k;j++)
						{
							i=i+1;
						}
					}
					else
					{
						break;
					}
				}
			sum[z] = num [i];
			z++;

		}
		/*for(z=0;z<sum.length;z++)
		{
			System.out.print(sum[z]+"\t");
		}*/
		for(p=0;p<sum.length;p++)
		{
			total = total + sum[p];
		}
		System.out.println("Sum is \t"+total);
	}

}
