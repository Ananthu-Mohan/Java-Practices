package OOPS;
class Animal
{
	void eat()
	{
		System.out.println("Inside Animal->Eat");
	}
	void sleep()
	{
		System.out.println("Inside Animal->Sleep");
	}
}
class Bird extends Animal
{
	void eat()
	{
		System.out.println("Inside Bird->Eat");
	}
	void sleep()
	{
		System.out.println("Inside Bird->Sleep");
	}
	void fly()
	{
		System.out.println("Inside Bird->Fly");
	}
}
public class prg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		System.out.println("Invoking Animal Object ");
		a.eat();
		a.sleep();
		Bird b = new Bird();
		System.out.println("Invoking Bird Object");
		b.eat();
		b.sleep();
		b.fly();
	}

}
