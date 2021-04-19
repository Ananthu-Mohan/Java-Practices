package Abstraction_Exception;

import automobile.Hero;
import automobile.Vechile;
public class prg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero H = new Hero();
		System.out.println("Model name = "+H.getModelName());
		System.out.println("Registration Number = "+H.getRegistrationNumber());
		System.out.println("Owner Name = "+H.getOwnerName());
		System.out.println("Speed = "+H.getSpeed());
		H.radio();
		
	}

}
