package javaexamples;

public class Subtract {
	int sub(int a,int b) {
		return (a-b);
	}
	double sub(double a,double b) {
		return (a-b);
	}
	int sub(int a, int b, int c) {
		return (a-b-c);
	}

	public static void main(String[] args) {
		Subtract a=new Subtract();
		int intsub=a.sub(4, 3);
		double doublesub=a.sub(5.5,3.5);
		int int3sub=a.sub(10, 3, 5);
		System.out.println("Subtraction of two integer is : "+ intsub);
		System.out.println("Subtraction of two double is : "+ doublesub);
		System.out.println("Subtraction of three integer is : "+ int3sub);

	}

}

