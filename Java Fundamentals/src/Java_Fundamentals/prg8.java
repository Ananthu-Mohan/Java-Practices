package Java_Fundamentals;

public class prg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'q';
		if(Character.isLetter(ch))
		{
			System.out.println("Alphabet");
		}
		else if(Character.isDigit(ch))
		{
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Character");
		}
	}

}
