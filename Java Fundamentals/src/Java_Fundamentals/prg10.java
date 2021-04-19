package Java_Fundamentals;
import java.lang.*;
public class prg10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch ='a';
		if(Character.isLowerCase(ch))
		{
			System.out.println(ch+"-->"+Character.toUpperCase(ch));
		}
		else if(Character.isUpperCase(ch))
		{
			System.out.println(ch+"-->"+Character.toLowerCase(ch));
		}
		else {
			System.out.println("Error");
		}
	}

}
