package Java_Fundamentals;

import java.util.Scanner;
import java.lang.*;
public class prg12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int month;
		System.out.println("Enter the number: ");
		month = S.nextInt();
		if(month>12) {
			System.out.println("Enter b/w :1-12");
			System.exit(0);
			}
		else
		{
			switch(month)
			{
				case 1: System.out.print("Jan");
				case 2: System.out.print("Feb");
				case 3: System.out.print("Mar");
				case 4: System.out.print("Apr");
				case 5: System.out.print("May");
				case 6: System.out.print("Jun");
				case 7: System.out.print("Jul");
				case 8: System.out.print("Aug");
				case 9: System.out.print("Sept");
				case 10: System.out.print("Oct");
				case 11: System.out.print("Nov");
				case 12: System.out.print("Dec");
			}
		}
	}

}
