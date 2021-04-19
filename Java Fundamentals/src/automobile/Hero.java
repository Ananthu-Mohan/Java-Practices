package automobile;

import automobile.Vechile;
import java.util.*;
public class Hero extends Vechile{
	
	String model,reg_no,name,radios;
	int speed;
	Scanner S = new Scanner(System.in);
	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Model name");
		model = S.nextLine();
		return model;
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Registration number");
		reg_no = S.nextLine();
		return reg_no;
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Owner name");
		name = S.nextLine();
		return name;
	}
	public int getSpeed()
	{
		System.out.println("Enter  the speed");
		speed = S.nextInt();
		return speed;
	}
	public void radio()
	{
		System.out.println("Radio on or off");
		radios = S.next();
		System.out.println("Radio = "+radios);
	}


		
}
