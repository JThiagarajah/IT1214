class Paper{
int length=10;
int width=15;
String text;	
	
}

class Document{
	String name;
	Paper p;//declaration
	
	public static void main(String[] args){
		Document d=new Document();
		System.out.println("created a Document Object D");
		d.name="My First Document";
		System.out.println("Name of the Document D is "+d.name);
		
		
		
		d.p=new Paper();
		System.out.println("Assigned in class paper: Size (1*w) of the paper of the document is "+d.p.length+"*"+d.p.width);
		
		
		d.p.length=60;
		d.p.width=30;
		d.p.text="This is the text in paper of document My first document";
		System.out.println("Size (1*w) of the paper of the document is "+d.p.length+"*"+d.p.width);
		System.out.println("Text value of papaer p of document d is "+d.p.text);
		
		
		//d.ptext="This is the text in the paper of document in first document";
		
		Document d1=new Document();
		System.out.println("Created a Document object D1");
		d1.name="My second Document";
		System.out.println("Name of the Document D1 is "+d1.name);
		
		
	}
	
}