package inheritance;

import java.util.Scanner;

class Details_2
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
class Student_2 extends Details_2                   //Details is a Super Class and Student is a Sub Class
{
	int total=0;
	double avg;
	void calc()
	{
		total = internal + external;
		avg = total / 2;
		
	}
	
}
class Display_1 extends Details_2
{
	
	void putData()
	{
		System.out.println("Name = "+name);
		System.out.println("Roll_No = "+roll_no);
		System.out.println("Internal_marks = "+internal);
		System.out.println("External_marks = "+external);
	}
}
public class hierarchical_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display_1 d = new Display_1();
		d.getData();
		d.putData();
	}

}
