package javaexamples;

public class Employee {
	static {
		System.out.println("This is static block1 ");
	}
	String empName;
	int empId;
	double empSalary;
	String empDesignation;
	static String company;

	Employee(String name,int id,double salary,String designation){
		empName=name;
		empId=id;
		empSalary=salary;
		empDesignation=designation;
	}
	
	static  void initcompany(String comp){
		company=comp;
	}
	void showDetails() {
		System.out.println("Name : "+empName);
		System.out.println("Id : "+empId);
		System.out.println("Salary : "+empSalary);
		System.out.println("Designation : "+empDesignation);
		System.out.println("Company : "+company);
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		Employee emp1=new Employee("Shashank1",1,100.00,"Trainee");
		Employee emp2=new Employee("Shashank2",2,150.00,"Trainee");
		Employee emp3=new Employee("Shashank3",3,200.00,"Trainee");
		initcompany("Tietoevry");
		
		emp1.showDetails();
		emp2.showDetails();
		emp3.showDetails();
	}
	static {
		System.out.println("This is static block2 ");
	}
}

