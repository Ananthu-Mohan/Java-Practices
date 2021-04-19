package Wrapper_classes;

public class string_functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch = new String("Hello World");
		StringBuffer ch_1 = new StringBuffer("New Popcorn");
		String str = new String("How are you");
		System.out.println("Length of String = "+ch.length());
		System.out.println("Character at postion 4 = "+ch.charAt(4));
		System.out.println("Code point at postion 4 = "+ch.codePointAt(4));
		System.out.println("Code point at before postion 4 = "+ch.codePointBefore(4));
		System.out.println("Hash code of string = "+ch.hashCode());
		System.out.println("Substring cuttedd from postion 0 to 4 = "+ch.substring(0,4));//4 is not included
		System.out.println("Index of (give the character to get the index value) = "+ch.indexOf('W'));
		System.out.println("Last Index of (give the character to get the index value,Counts from the last position) = "+ch.lastIndexOf('H'));//the postioining nnumber will not be affected
		System.out.println("Checks whether it starts with letter H ,return true if so = "+ch.startsWith("H"));
		System.out.println("Checks whether it ends with letter d, return true if so = "+ch.endsWith("d"));
		System.out.println("Concatenated String = "+ch.concat(" "+str));
		System.out.println("To Lower Case = "+ch.toLowerCase());
		System.out.println("To Upper Case = "+ch.toUpperCase());
		System.out.println("Comapring 2 strings = "+ch.compareTo(str));
		System.out.println("Comapring 2 strings with ignore case = "+ch.compareToIgnoreCase(str));
		System.out.println("Replaceing Hello with Hai = "+ch.replace("Hello","Hai"));
		System.out.println("Reverse String = "+ch_1.reverse());
		System.out.println("Capacity = "+ch_1.capacity());
		
	}

}
