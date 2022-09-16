package javaexamples;



public class Matrix {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		int c[]=new int[4];
		
		for(int i=0;i<4;i++) {
			c[i]=a[i]+b[i];
		}
		for(int i=0;i<4;i++) {
			System.out.print(c[i]+" ");
		}
	}

}
