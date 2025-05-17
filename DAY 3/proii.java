class One{
		int a=10;//variable definition 
		int b;	//variable declaration 
		
		void print_details(){	//method
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		}
}

class Two{
	int a,c; //declaration only
	
		void print_details(){	//method
		System.out.println("From class Two a = "+a);
		System.out.println("From class Two c = "+c);
		
	}
}

class App{
	public static void main(String[] args){
		
		One o1=new One();
		Two t1=new Two();
		o1.printDetails();
		
		o1.print_details();
		t1.print_details();
		
	}
	
	
}