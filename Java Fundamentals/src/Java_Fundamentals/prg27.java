package Java_Fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class prg27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = new int[5];
		int [] duplicate = new int[5];
		int i,j;
		int unique;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the elements in to the array ");
		for(i=0;i<5;i++)
		{
			num[i] = s.nextInt();
		}
		unique = num.length;
		//System.out.print(unique);
		for(i=0;i<unique;i++)
		{
			for(j=i+1;j<unique;j++)
			{
				if(num[i] == num[j])
				{
					num[j] = num[unique-1];
					unique--;
				}
			}
		}
		duplicate = Arrays.copyOf(num,unique);
		for(i=0;i<duplicate.length;i++)
		{
			System.out.print(duplicate[i]+"\t");
		}
	}

}
