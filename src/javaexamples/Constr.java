package javaexamples;


public class Constr {
	boolean bool;
	byte byt;
	short sht;
	int i;
	long l;
	char ch;
	float f;
	double d;
	

	public static void main(String[] args) {
	Default def= new Default();
	def.bool=true;
def.byt=22;
	def.sht=11111;
	def.i=2;
	def.l=1111111111;
	def.ch='c';
	def.f=2f;
	def.d=4.5;
	System.out.println("Boolean : "+ def.bool);
	System.out.println("Byte : "+ def.byt);
	System.out.println("Short : "+ def.sht);
	System.out.println("int : "+ def.i);
	System.out.println("long : "+ def.l);
	System.out.println("Char : "+ def.ch);
	System.out.println("Float : "+ def.f);
	System.out.println("Double : "+ def.d);
	}

}