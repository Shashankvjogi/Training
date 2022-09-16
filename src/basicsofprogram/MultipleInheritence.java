package basicsofprogram;

interface interfeace1{
    void m1();
}
interface interfeace2{
    void m2();
}

public class MultipleInheritence implements interfeace1,interfeace2{
    public static void main(String args[]){
    	MultipleInheritence i=new MultipleInheritence();
    	i.m1();
    	i.m2();
    }
    public void m1() {
        System.out.println("This is interface 1");
    }
    public void m2() {
        System.out.println("This is interface 2");
    }
}
