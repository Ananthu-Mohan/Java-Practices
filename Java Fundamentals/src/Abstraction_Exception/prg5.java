package Abstraction_Exception;
import string.venna;
import wind.Saxophone;
import music.Playable;
public class prg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		venna V = new venna();
		Saxophone S = new Saxophone();
		V.play();
		S.play();
		Playable P = new venna();
		P.play();
		Playable T = new Saxophone();
		T.play();
	}

}
