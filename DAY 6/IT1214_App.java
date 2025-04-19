class Student{
	int marks;
	String name;
	
	Student(){
		System.out.println("Creating a Student Object");
		name="Default Name";
	}
		
	Student(String n,int m){
		System.out.println("Creating a Student Object with name "+n+" and marks "+m);
		name=n;
		marks=m;
	
		
	}
}
class Printer{
	void print(String a)
	{
		System.out.println(a);
	}
	
	
}


class App{
	public static void main(String[]args){
		Printer p=new Printer();
		System.out.println("Welcome to Demo Class App");
		
		Student s1=new Student();
		System.out.println("Hey The name of the Student = "+s1.name);
		System.out.println("Marks for the student = "+s1.marks);
		s1.marks=90;
		s1.name="Joe";
		
		
		System.out.println("Hey The name of the Student is "+s1.name+" and the marks for the student is "+s1.marks);
		System.out.println("Marks for the student is "+s1.marks);
		
		
		Student s2=new Student();
		s2.name="Thanees";
		s2.marks=100;
		System.out.println("Name of the Student is "+s2.name+" and the marks is "+s2.marks+" And the Grade is A+");
		
		
		Student s3=new Student("Riya",99);
		System.out.println("Name of the Student is "+s3.name);
		System.out.println("Marks of the Student is "+s3.marks);
		


	}

}