package interface_examples;

import java.util.Scanner;

interface marks
{
	void internal();
	void external();
}
interface total
{
	void sum();
	void avg();
}
class details implements marks,total
{
	Scanner S = new Scanner(System.in);
	int roll_no;
	String name;
	int internal;
	int external;
	int total;
	double avg;
	
	public void read()
	{
		System.out.println("Enter the name of the Student ");
		name = S.next();
		System.out.println("Enter the roll no of the Student ");
		roll_no = S.nextInt();
	}
	
	public void internal()
	{
		
		System.out.println("Enter External mark ");
		external = S.nextInt();
		
	}
	public void external()
	{
		
		System.out.println("Enter Internal mark ");
		internal = S.nextInt();
	}
	
	public void sum()
	{
		total = internal + external;
	}
	
	public void avg()
	{
		avg = total / 2;
	}
}

class Display extends details
{
	void show()
	{
		System.out.println("Name  = "+name);
		System.out.println("Rollno  = "+roll_no);
		System.out.println("Internal Mark  = "+internal);
		System.out.println("External Mark  = "+external);
		System.out.println("Total Mark  = "+total);
		System.out.println("Average Mark  = "+avg);
		
	}
}

public class student_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d = new Display();
		d.read();
		d.internal();
		d.external();
		d.sum();
		d.avg();
		d.show();

	}

}
