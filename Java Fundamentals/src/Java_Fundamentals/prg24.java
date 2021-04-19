package Java_Fundamentals;

public class prg24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ascii_values = {65,66,67,68,69,70,71,72,73};
		int i,num;
		char[] ch = new char[ascii_values.length];
		for (i=0;i<ascii_values.length;i++)
		{
			num = ascii_values[i];
			ch[i] = (char)num;
			System.out.print(ch[i]+"\t");
		}
	}

}
