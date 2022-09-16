package basicsofprogram;

abstract class abs{
	abstract void m1();
}
public class AbstractClass extends abs{
	void m1() {
		 System.out.println("This is abstract class");
	}
	public static void main(String[] args) {
		AbstractClass a=new AbstractClass();
		a.m1();

	}

}
