import java.util.Scanner;

class GPA{
	float gradePoint(String grade){
		float gp=0;//grade point value
		/*
		if(grade.equals("A+") || grade.equals("A"))
		{
			gp=4;
		}else{
			if(grade.equals("A-")){
				gp=3;
			}
		}
		*/
		switch(grade){
			case "A+":
			gp=4;
			break;
			
			case "A":
			gp=4;
			break;
			
			case "A-":
			gp=3.7f;
			break;
			
			case "B+":
			gp=3.3f;
			break;
			
			case "B":
			gp=3;
			break;
			
			case "B-":
			gp=2.7f;
			break;
			
			case "C+":
			gp=2.3f;
			break;
			
			case "C":
			gp=2;
			break;
			
			case "C-":
			gp=1.7f;
			break;
			
			case "D+":
			gp=1.3f;
			break;
			
			case "D":
			gp=1;
			break;
			
			
			
		}
		
		
		return gp;
		
	}
}

class Demo{
	public static void main(String[] args){
	String name;
	float ogpa;
	String grade;
	float point;
	
	Scanner sc=new Scanner(System.in);
	GPA g=new GPA();
	
	System.out.println("Enter Your Name: ");
	name=sc.nextLine();
	
	System.out.println("Hii "+name+", let's now calculate your GPA!");
	
		System.out.println("Enter the Grade for IT1113: ");
		grade=sc.nextLine();
		point=g.gradePoint(grade);
		ogpa=point*3;
		
		System.out.println("Enter the Grade for IT1122: ");
		grade=sc.nextLine();
		point=g.gradePoint(grade);
		ogpa=ogpa+point*2;
		System.out.println("Grade point value of the grade " +grade+ " is " +point);
		System.out.println("Overall GPA is "+ogpa);
		
		System.out.println("Enter the Grade for IT1134: ");
		grade=sc.nextLine();
		point=g.gradePoint(grade);
		ogpa=ogpa+point*4;
		System.out.println("Grade point value of the grade " +grade+ " is " +point);
		System.out.println("Overall GPA is "+ogpa);
		
		System.out.println("Enter the Grade for IT1144: ");
		grade=sc.nextLine();
		point=g.gradePoint(grade);
		ogpa=ogpa+point*4;
		System.out.println("Grade point value of the grade " +grade+ " is " +point);
		System.out.println("Overall GPA is "+ogpa);
		
		System.out.println("Enter the Grade for IT1152: ");
		grade=sc.nextLine();
		point=g.gradePoint(grade);
		ogpa=ogpa+point*2;
		System.out.println("Grade point value of the grade " +grade+ " is " +point);
		System.out.println("Overall GPA is "+ogpa);
	
	System.out.println("Grade point value of the grade "+grade+" is "+point);
	System.out.println("Overall grade point is "+ogpa);
	
	
	
	System.out.println("Final GPA is for current semester is "+ogpa/15);
	

	
	}
}