package classdemo;

public class stringPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "an^@thu";
		char ch ='\0';
		String str2 = "";
		int index = 0;
		for(int i=0;i<str1.length();i++)
		{
			ch = str1.charAt(i);
			if(Character.isLetter(ch))
			{
				str2 += ch;
			}
		}
		StringBuffer sbuff = new StringBuffer(str2);
		sbuff = sbuff.reverse();
		for(int i=0;i<str1.length();i++)
		{
			ch = str1.charAt(i);
			if(!(Character.isLetter(ch)))
			{
				index = str1.indexOf(ch,i);
				sbuff = sbuff.insert(index, ch);
			}
		}
		str2 = sbuff.toString();
		System.out.println("Original String  = "+str1);
		System.out.println("Reversed String = "+str2);
	}

}
