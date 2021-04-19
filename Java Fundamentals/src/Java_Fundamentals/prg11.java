package Java_Fundamentals;

import java.util.Scanner;

public class prg11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the colour code: ");
		String ch = S.next();
		switch(ch)
		{
		case "R":
			System.out.println("Red");
			break;
			
		case "G":
			System.out.println("Green");
			break;
		
		case "B":
			System.out.println("Blue");
			break;
			
		case "O":
			System.out.println("Orange");
			break;
			
		case "Y":
			System.out.println("Yellow");
			break;
			
		case "W":
			System.out.println("White");
			break;
		default: System.out.println("Inavlid Code");
		}
			
				
	}

}
