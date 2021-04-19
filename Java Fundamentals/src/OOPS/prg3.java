package OOPS;
import java.util.*;
class Author
{
	String name;
	String email;
	String gender;
	Author(String n,String e, String g)
	{
		name = n;
		email = e;
		gender = g;
	}
	void out_Author()
	{
		System.out.println("Name of the Author = "+name);
		System.out.println("Email of the Author = "+email);
		System.out.println("Gender of the Author = "+gender);
	}
}
class Book
{
	String name_1;
	double price;
	int qtyInstock;
	Book(String n1,double p1,int q1)
	{
		name_1 = n1;
		price = p1;
		qtyInstock = q1;
	}
	void out_Book()
	{
		System.out.println("Name of the book = "+name_1);
		System.out.println("Price of the book = "+price);
		System.out.println("Quantity In Stock = "+qtyInstock);
	}
	
}
public class prg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		String name;
		String email;
		String gender;
		String b_name;
		double price;
		int qty;
		System.out.println("Enter the name of the Author");
		name = S.next();
		System.out.println("Enter the email of the Auhtor");
		email = S.next();
		System.out.println("Enter the gender of the Author");
		gender = S.next();
		Author a = new Author(name,email,gender);
		System.out.println("Enter the name of the book ");
		b_name = S.next();
		System.out.println("Enter the price of the book");
		price = S.nextDouble();
		System.out.println("Enter the quantity of the book ");
		qty = S.nextInt();
		a.out_Author();
		Book b = new Book(b_name,price,qty);
		b.out_Book();
		

	}

}
