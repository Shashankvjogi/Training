package javaexamples;

public class RevStr {

	public static void main(String[] args) {
		String name="Shashank";
		char ch;
		String revstr="";
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			revstr=ch+revstr;
		}
		System.out.println("String :- "+name);
		System.out.println("Reverse of String :- "+revstr);

	}

}
