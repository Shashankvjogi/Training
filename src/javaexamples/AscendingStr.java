package javaexamples;

import java.util.Arrays;

public class AscendingStr {

	public static void main(String[] args) {
		String str="shashank";
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		System.out.println("Sorted string is : "+new String(ch));
	}

}
