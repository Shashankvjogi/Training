package basicsofprogram;

interface inter{
	void m1();
}

public class Interface implements inter{

public void m1() {
		
	System.out.print("This is Interface");	
	}
	public static void main(String[] args) {
		Interface i=new Interface();
		i.m1();
	}
}
