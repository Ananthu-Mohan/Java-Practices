package extra;

public class abbrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "Liberalization Privatization and Globalization aimed at making the Indian economy as fastest growing economy";
		char first ='\0';
		char last ='\0';
		String[] words = input1.split(" ");
		String new_word = new String();
		for(String s:words)
		{
			int len = s.length();
			int btw = 0,rem = 0,sum = 0;
			if(len>10)
			{
				first = s.charAt(0);
				last = s.charAt(len-1);
//				System.out.println(first);
//				System.out.println(last);
				btw = len-2;
//				System.out.println(btw);
				if(btw>9)
				{
					while(btw!=0) 
					{
						rem = btw%10;
						sum +=rem;
						btw /=10;
					}
				}
				new_word = first+String.valueOf(sum)+last;
//				System.out.println(new_word);
				input1 = input1.replaceAll(s, new_word);
			}
		}
		System.out.println(input1);
	}

}
