class Car{

public String model;
//Getter

public String getModel(){
	return model;
	
}
//setter
public void setModel(String newModel) {
	this.model=newModel;
}
}
public class Mini
{
	public static void main(String args[])
	{
		Car Obj1=new Car();
		Obj1.setModel("Toyota Corolla");
		
		Car c1=new Car();
		c1.setModel("Mazda s3");
		
		Car c2=new Car();
		c2.setModel("Nissan Navara");
		
		System.out.println(Obj1.getModel());
		
	}
}

		