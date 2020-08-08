public class Car {
    int id = 2345;
	String color = "white";
	int  length = 5;
	void Length()
	{
		System.out.println("Length of the car :"+length);
	}
	void id() 
	{
		System.out.println("Id number of the car :"+id);
	}
	void color() 
	{
		System.out.println("color of the car :"+color);
	}
	public static void main(String args[])
	{
		Car car=new Car();
		car.Length();
		car.id();
		car.color();
	}

}
