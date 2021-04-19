package Java_Fundamentals;

import java.util.Scanner;

public class prg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem_x,rem_y;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter two numbers \n");
		int x = S.nextInt();
		int y = S.nextInt();
		if((x>0)&&(y>0))
		{
			rem_x = x%10;
			rem_y = y%10;
			if(rem_x == rem_y)
			{
				System.out.println(x+" "+y+" --> True positive");
			}
			else
			{
				System.out.println("false");
			}
		}
		else if(x<0||y<0)
		{
			System.out.println("Fasle Neagtive Number present");
		}
		else {
			System.out.println("False Contains Zero");
		}
	}

}
