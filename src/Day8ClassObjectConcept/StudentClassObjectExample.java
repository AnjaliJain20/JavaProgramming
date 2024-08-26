package Day8ClassObjectConcept;

public class StudentClassObjectExample {
	
	int stuid;
	String stuname;
	char grade;
	
	//Approach 2 - Using method
	void display()
	{
		System.out.println(stuid);
		System.out.println(stuname);
		System.out.println(grade);
	}

	void setData(int id,String name, char g )
	{
		stuid=id;
		stuname=name;
		grade=g;
	}
	

	public static void main(String[] args) 
	   {
		StudentClassObjectExample stu1=new StudentClassObjectExample();	
		   stu1.setData(18, "Anjali", 'A');
		   stu1.display();
		
		}
		

	}


