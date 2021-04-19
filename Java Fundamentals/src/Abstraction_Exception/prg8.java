package Abstraction_Exception;
import java.util.*;

class NegativeException extends Exception
{
	public NegativeException(String s)
	{
		super(s);
	}
}

class NotRange extends Exception
{
	public NotRange(String s)
	{
		super(s);
	}
}
public class prg8 {
	
	void Negativecheck(int num)throws NegativeException
	{
		if(num<0)
		{
			throw new NegativeException("Negative Number");
		}
	}
	
	void RangeCheck(int num) throws NotRange
	{
		if(num>100)
		{
			throw new NotRange("Out of Range Exception");
		}
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		prg8 p = new prg8();
		int marks [] = new int[3];
		String name;
		Scanner S = new Scanner(System.in);
		try
		{
			
			System.out.println("Enter the Name of the student :");
			name = S.next();
			System.out.println("Enter the Mark for 3 Subjects :");
			for(int i =0;i<3;i++)
			{
				marks[i] = S.nextInt();
				p.Negativecheck(marks[i]);
				p.RangeCheck(marks[i]);
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		catch(NegativeException e)
		{
			System.out.println(e);
		}
		catch(NotRange e)
		{
			System.out.println(e);
		}
	}

}
