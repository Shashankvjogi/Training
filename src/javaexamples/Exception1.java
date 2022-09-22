package javaexamples;

public class Exception1 {
	int a=10,b=0;
	int c;
	public static void main(String[] args) {
		Exception1 e=new Exception1();
		try {
			e.c=e.a/e.b;
			System.out.println("Value of c is "+e.c);
			
		}catch(ArithmeticException ex) {
			System.out.print("Exception Occured");
		}
	}

}
