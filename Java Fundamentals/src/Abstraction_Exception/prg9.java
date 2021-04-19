package Abstraction_Exception;
import java.util.*;
class InvalidCountryException extends Exception
{
	public InvalidCountryException(String s)
	{
		super(s);
	}
}

class UserRegistration
{
	public void registerUser(String username,String country) throws InvalidCountryException
	{
		String str = "India";
		if(country.equalsIgnoreCase(str))
		{
			System.out.println("User Registration done Successfully");
		}
		else
		{
			throw new InvalidCountryException("Wrong Country");
		}
	}
}
public class prg9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserRegistration U = new UserRegistration();
		Scanner S = new Scanner(System.in);
		String name,country;
		System.out.println("Enter the user name");
		name = S.next();
		System.out.println("Enter the country");
		country = S.next();
		try {
			U.registerUser(name, country);
		} 
		catch (InvalidCountryException e) 
		{
			System.out.println(e);

		}
	}

}
