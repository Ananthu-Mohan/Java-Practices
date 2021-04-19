package Java_Fundamentals;

public class prg9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = Integer.parseInt(args[1]);
		String gender = args[0];
		if((gender.equals("Female"))&&((age>=1)&&(age<=58)))
		{
			System.out.println("Precentage of Intereset = 8.2%");
		}
		else if((gender.equals("Female"))&&((age>=59)&&(age<=100)))
		{
			System.out.println("Precentage of Intereset = 9.2%");
		}
		else if((gender.equals("Male"))&&((age>=1)&&(age<=58)))
		{
			System.out.println("Precentage of Intereset = 8.4%");
		}
		else if((gender.equals("Male"))&&((age>=59)&&(age<=100)))
		{
			System.out.println("Precentage of Intereset = 10.5%");
		}
		else {
			System.out.println("Error");
		}
	}

}
