import java.util.Scanner;

class GPA{
	float gradePoint(String grade){
		float gp=0;
		/*if (grade.equals("A+")|| grade.equals("A")){
			gp=4;
		}else
		{
			if(grade.equals("A-")){
				gp=3.7f;
			}
		}
		*/
		
		switch (grade){
			
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
			default:
				gp=0;
		}
		return gp;
		
	}
}


class Demo{
	static Scanner sc=new Scanner(System.in);
	static GPA g=new GPA();
	
static String subjects[]={"IT1133","IT1122","IT1144","IT1134","IT1152"};
static int credits[]={3,2,4,4,2};
	static String[] grades=new String[5];
	static float[] gps=new float[5];
	
	static float getPoint(String subjectCode, int credit, int index){
		System.out.print("Enter the Grade for "+subjectCode+": ");
		String grade= sc.nextLine();
		System.out.println("Grade point value of the grade " +grade+ " is " + g.gradePoint(grade));
		System.out.println("Grade point * credit is "+g.gradePoint(grade)*credit);
		grades[index] = grade;
gps[index] = g.gradePoint(grade);
return gps[index] * credit;

				
	}
	
	
	public static void main(String[] arg){
		
		String name;
		float ogpa=0;
		
		/*String grade;
		float point=0;
		String satisfied;*/
	
		System.out.println("Enter your name :");
		name=sc.nextLine();
		System.out.println("Hi "+name);
		
		
		for(int i=0; i<5; i++)
		{
			ogpa+=getPoint(subjects[i],credits[i], i);
		}
		
		/*System.out.println("Enter the Grade for IT1113: ");
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
		

		ogpa+=getPoint("IT1113",3);//read the Grade of IT1113, Get the Point value, return the point*credit
		ogpa+=getPoint("IT1122",2);
		ogpa+=getPoint("IT1134",4);
		ogpa+=getPoint("IT1144",4);
		ogpa+=getPoint("IT1152",2);*/
		
		System.out.println("Final GPA is for the current semester is "+ogpa/15);
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Subject "+subjects[i]+"Credit "+credits[i]+"Grade "+grades[i]+" Grade Point");
		}
		
		
		
		
		
		
		
	}
}

