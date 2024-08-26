package Day8ClassObjectConcept;

public class EmployeeClassObjectExample {
	int empid;
	String ename;
	String job;
	int esal;
	
	//Approach 1- by object reference
	
	void display()
	{
		System.out.println(empid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(esal);
	}
	
	public static void main(String[] args) {
		EmployeeClassObjectExample co=new EmployeeClassObjectExample();
		co.empid=100;
		co.ename="Anjali";
		co.job="Quality Analyst";
		co.esal=75000;
		co.display();
		
		EmployeeClassObjectExample ec=new EmployeeClassObjectExample();
		ec.empid=200;
		ec.ename="Neha";
		ec.job="Quality Analyst";
		ec.esal=80000;
		ec.display();
		
		
		
	}

}
