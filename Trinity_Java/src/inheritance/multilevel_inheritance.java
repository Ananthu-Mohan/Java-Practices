package inheritance;

import java.util.Scanner;

class Details_1
{
	int roll_no;
	String name;
	int internal,external;
	Scanner S = new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter the Student name: ");
		name = S.next();
		System.out.println("Enter the Student roll_no: ");
		roll_no = S.nextInt();
		System.out.println("Enter the Student internal_mark: ");
		internal = S.nextInt();
		System.out.println("Enter the Student external_mark: ");
		external = S.nextInt();
	}
}
class Student_1 extends Details_1                   //Details is a Super Class and Student is a Sub Class
{
	int total=0;
	double avg;
	void calc()
	{
		total = internal + external;
		avg = total / 2;
		
	}
	
}
class Display extends Student_1
{
	void putData()
	{
		System.out.println("Total Marks = "+total);
		System.out.println("Average Marks = "+avg);
	}
}

public class multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d = new Display();
		d.getData();
		d.calc();
		d.putData();
		
		

	}

}
