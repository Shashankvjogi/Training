package javaexamples;

public class ThrowExample {
	static void test() {
		int a = 17;
		if(a<18) {
		throw new ArithmeticException("Not eligible");
		}
		else {
			System.out.println("Eligible");
		}
	}
	public static void main(String[] args) {
		test();
	}

}
