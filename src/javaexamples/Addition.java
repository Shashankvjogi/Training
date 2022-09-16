package javaexamples;

public class Addition {
	int add(int a,int b) {
		return (a+b);
	}
	double add(double a,double b) {
		return (a+b);
	}
	int add(int a, int b, int c) {
		return (a+b+c);
	}

	public static void main(String[] args) {
		Addition a=new Addition();
		int intadd=a.add(2, 3);
		double doubleadd=a.add(2.5,3.5);
		int int3add=a.add(2, 3, 5);
		System.out.println("Addition of two integer is : "+ intadd);
		System.out.println("Addition of two double is : "+ doubleadd);
		System.out.println("Addition of three integer is : "+ int3add);

	}

}
