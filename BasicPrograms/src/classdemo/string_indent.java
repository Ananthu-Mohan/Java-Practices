package classdemo;


public class string_indent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		String str1 = new String();
		str1 = "    Center /n For /n Technology Excellence    ";
		int len_before = str1.length();
		char ch ='\0';
		str1 = str1.trim();
		int len_after = str1.length();
		str1 = str1.replaceAll(" ", "");
		System.out.println(str1);//whitespaces removed
		String str[] = new String[str1.length()];
		str = str1.split("/n");
		for(String s:str)
		{
			System.out.println(s);
		}
		System.out.println();
		for(String s:str)
		{
			System.out.println(s.indent(n));
		}
		
	}

}
