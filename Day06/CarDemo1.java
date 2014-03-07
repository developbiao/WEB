/*
 * Practice: ÀàµÄÑ§Ï°
 * Author:Gonbiao
 * Date:2013-9-3
 */
class CarDemo
{
	public static void main(String[] args)
	{
		Car c1 = new Car();
		Car c2 = new Car();
		c2 = c1;
		c1.color = "white";
		c1.num = 9;
		c2.run();

	
	}
}

class Car
{
	String color;
	int num ;

	public void run()
	{
		int num = 2;
		System.out.println("The car color is "+color+",num is "+num);
	}
}

