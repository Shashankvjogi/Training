package javaexamples;

public class Pvt {
	private int a=10;
	int b=20;
	int c;
	int add() {
		 c=a+b;
		return c; 
	 }
	public static void main(String[] args) {
		Pvt p=new Pvt();
		System.out.print("Addition of two no.s is "+p.add());

	}

}
