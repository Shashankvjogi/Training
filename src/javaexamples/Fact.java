package javaexamples;

public class Fact {
	public static void main(String[] args) {
		int num=6;
		int i=1;
		int fact=1;
		while(i<=num) {
			fact=fact*i;
			i++;
		}
		System.out.print("Factorial of "+ num+" is "+fact );

	}

}
