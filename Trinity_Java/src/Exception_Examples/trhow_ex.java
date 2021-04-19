package Exception_Examples;

import java.io.DataInputStream;

public class trhow_ex {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		DataInputStream S = new DataInputStream(System.in);
		System.out.println("Enter your name ");
		@SuppressWarnings("deprecation")
		String name = S.readLine();
		System.out.println("Welcome "+name);

	}

}
