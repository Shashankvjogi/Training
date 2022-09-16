package javaexamples;

public class Compare {

	public static void main(String[] args) {
		String n1="Ho";
		String n2="Ho";
		int count=0;
		if(n1.length()==n2.length()) {
			for(int i=0;i<n1.length();i++) {
				if(n1.charAt(i)==n2.charAt(i)){
					count++;
				}
			}
			if(count==n1.length()) {
				System.out.println("Both the strings are same");
			}
		}
		else {
			System.out.println("Both the strings are not same");
			
		}
		

		
	}

}
