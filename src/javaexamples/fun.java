package javaexamples;

public class fun {
 int sum(int x,int y) {
	 int sum=x+y;
	 return sum;
 }
 
 int sub(int x,int y) {
	 int sub=x-y;
	 return sub;
 }
 void mul(int x,int y) {
	 System.out.println("Multiplication of two no. is "+ (x*y));
 }
 void div(int x,int y) {
	 System.out.println("Division of two no. is "+ (x/y));
 }
	public static void main(String[] args) {
		
int x=10,y=5;
fun fun1=new fun();

System.out.println("Addition of two no. is "+ fun1.sum(x,y));
System.out.println("Difference of two no. is "+ fun1.sub(x,y));
fun1.mul(x, y);
fun1.div(x, y);

	}

}
