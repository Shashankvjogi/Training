package javaexamples;

public class EmpDet {
	String empName;
	int empId;
	double empSalary;
	String empDesignation;

	void getDetails(String name,int id,double salary,String designation ) {
		empName=name;
		empId=id;
		empSalary=salary;
		empDesignation=designation;
	}
	void showDetails() {
		System.out.println("Name : "+empName);
		System.out.println("Id : "+empId);
		System.out.println("Salary : "+empSalary);
		System.out.println("Designation : "+empDesignation);
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		EmpDet emp1=new EmpDet();
		emp1.getDetails("Shashank",1,100.00,"Trainee");
		EmpDet emp2=new EmpDet();
		emp2.getDetails("Shashank1",2,100.00,"Trainee");
		EmpDet emp3=new EmpDet();
		emp3.getDetails("Shashank2",3,100.00,"Trainee");
		
		
		emp1.showDetails();
		emp2.showDetails();
		emp3.showDetails();
	}

}
