class Student{
	String name="Riya";
	int marks=100;
	
	
	Student(){
		name="NoName";
	}
	
	Student(String n){
		name=n;
	}
	
	Student(String n, int m){
		name=n;
		marks=m;
	}
	
	

}
class TestClass
{
	int a;
	public static void main(String [] ar){
		System.out.print("Hi From TestClass Class");
		
		
	}
		
}

class StudentDemo{
	public static void main(String[] args){
		System.out.println("Hi From Student Demo Class");
		System.out.println("creating an object of Student Class");
		Student s1=new Student("Nice name",95);
		
		System.out.println(" copy of creating an object of Student Class");
		System.out.println("CC Name value of the object is "+s1.name );
		System.out.println("CC Marks value of the object is "+s1.marks );
		s1.name="Bob";//setting the variable value
		s1.marks=10;
		
		System.out.println("Name value of the object is "+s1.name );
		System.out.println("Marks value of the object is "+s1.marks );
		
		
	
}
}