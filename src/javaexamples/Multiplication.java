package javaexamples;


public class Multiplication {
	int mul(int a,int b) {
		return (a*b);
	}
	double mul(double a,double b) {
		return (a*b);
	}
	int mul(int a, int b, int c) {
		return (a*b*c);
	}

	public static void main(String[] args) {
		Multiplication a=new Multiplication();
		int intmul=a.mul(2, 3);
		double doublemul=a.mul(2.5,3.5);
		int int3mul=a.mul(2, 3, 5);
		System.out.println("Multiplication of two integer is : "+ intmul);
		System.out.println("Multiplication of two double is : "+ doublemul);
		System.out.println("Multiplication of three integer is : "+ int3mul);

	}

}

