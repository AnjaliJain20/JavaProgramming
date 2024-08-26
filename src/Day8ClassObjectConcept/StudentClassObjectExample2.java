package Day8ClassObjectConcept;

public class StudentClassObjectExample2 {
	
	int sid;
	String sname;
	char grade;
	
	//Approach 3- Using constructor
	
	void show() {
		System.out.println(sid+" "+sname+" "+grade);
	}
	
	/*void setdata(int id,String name,char g)
	{
		sid=id;
		sname=name;
		grade=g;
	}*/
	StudentClassObjectExample2(int id,String name,char g)
	{
		sid=id;
		sname=name;
		grade=g;
	}
	
	
	public static void main(String[] args) {
		
		StudentClassObjectExample2 student = new StudentClassObjectExample2(101,"Anjali",'B');
		student.show();
		
	}

}
