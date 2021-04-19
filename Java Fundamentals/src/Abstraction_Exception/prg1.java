package Abstraction_Exception;

abstract class Compartment
{
	abstract String notice();
}
class FirstClass extends Compartment
{
	String notice()
	{
		String str = "First Class";
		return str;
	}
}
class Ladies extends Compartment
{
	String notice()
	{
		String str = "Ladies";
		return str;
	}
}
class General extends Compartment
{
	String notice()
	{
		String str = "General";
		return str;
	}
}
class Luggage extends Compartment
{
	String notice()
	{
		String str = "Luggage";
		return str;
	}
}
public class prg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment c[] = new Compartment[10];
		double i = Math.random()*5;
		System.out.println(i);
		int x = (int)i;
		String str;
		System.out.println(x);
        switch(x) 
        {
	        case 1: 
		        c[0] = new FirstClass();
		        str = c[0].notice(); 
		        System.out.println(str);
		        break;
	        case 2: 
		        c[1] = new Ladies(); 
		        str = c[1].notice(); 
		        System.out.println(str);
		        break;
	        case 3: 
		        c[2] = new General(); 
		        str = c[2].notice(); 
		        System.out.println(str);
		        break;
	        case 4: 
		        c[3] = new Luggage(); 
		        str = c[3].notice(); 
		        System.out.println(str);
		        break;
	        default:System.out.println("Wrong Choice");

        }

	}
}
