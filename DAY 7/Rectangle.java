class Rectangle{
	int height;
	int width;
	
	Rectangle(){
		height=2;
		width=2;
	}
	
	Rectangle (int height, int width){
	this.height=height;
	this.width=width;
	System.out.println("Just created a rectagle object with size (h*w)"+height+"*"+width);
	print(width, height);
	}

}
void get_deatils(){
	System.out.println("Height"+height+" , width "+width);
}

	void print(int width, int height)
	{
		for(int i=0; i<height; i++){ //for lines i.e./ height
		
			for(int j=0; j<width; j++){//for th *'s i.e., width
				System.out.print("*");//* in each line
			}
			System.out.println();//break line
	}

}
}

class Main{
	public static void main(String[]args){
		/*for(int i=0; i<10; i++){
			System.out.println("Value if i is "+i);
		}
			
	*/
	Rectangle r1= new Rectangle(5,3);
	Rectangle r2= new Rectangle(3,6);
	r1.height=10;
	r1.width=20;
	Rectangle r3=r1;
	
	r1.get_details();
	r2.get_details();
	r3.get_details();
	
	/*System.out.println("Height "+r1.height+" , width"+r1.width);
	System.out.println("Height "+r2.height+" , width"+r2.width);
	System.out.println("Height "+r3.height+" , width"+r3.width);
	
	}
}
//hint you may use nested for loops and print, println 
/*Expected output:
***
***
***
***

*/