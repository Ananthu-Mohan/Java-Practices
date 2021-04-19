package Abstraction_Exception;

class ageException extends Exception
{
	public ageException(String S)
	{
		super(S);
	}
}

public class prg10 {

	void ageCheck(int age) throws ageException
	{
		if(age<=18 && age>60)
		{
			throw new ageException("age not valid exception");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prg10 p = new prg10();
		int age;
		String name;
		name = args[0];
		age = Integer.parseInt(args[1]);
		System.out.println("Name = "+name);
		try
		{
			System.out.println("Age = "+age);
			p.ageCheck(age);
		}
		catch(ageException e)
		{
			System.out.println(e);
		}
	}

}
