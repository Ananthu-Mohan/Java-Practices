package Exception_Examples;

public class prg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		try
		{
			a = 10 / 0;
		}
		catch(Exception ec)
		{
			System.out.println("Exception Found = "+ec);
		}
	}

}
