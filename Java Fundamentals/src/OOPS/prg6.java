package OOPS;
import java.util.*;
class Fruit
{
	String name,taste;
	int size;
	Scanner S = new Scanner(System.in);
	void eat()
	{
		System.out.println("Enter the name of the fruit");
		name = S.next();
		System.out.println("Enter the taste of the fruit");
		taste = S.next();
		System.out.println("Enter the size of the fruit");
		size = S.nextInt();
		System.out.println("Name of the fruit = "+name);
		System.out.println("Taste of the Fruit = "+taste);
		System.out.println("Size of the Fruit ="+size);
	}
}
class Apple extends Fruit
{
	void eat()
	{
		System.out.println("Apple");
		System.out.println("Sweet");
	}
}
class Orange extends Fruit
{
	void eat()
	{
		System.out.println("Orange");
		System.out.println("Sour");
	}
}
public class prg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit F = new Fruit();
		F.eat();
		Apple A = new Apple();
		A.eat();
		Orange O = new Orange();
		O.eat();
	}

}
