package javaexamples;

public class MultipleException1 {

	public static void main(String[] args) {
		int a[]=new int[6];
		try {
			a[7]=10/0;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out Of Bounds Exception");
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception");
		}
		catch(Exception e){
			System.out.println(" Exception");
		}

	}

}
