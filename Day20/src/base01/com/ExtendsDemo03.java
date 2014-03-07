package base01.com;

public class ExtendsDemo03 {
	
	public static void main(String[] args){
		
		City c = new City();
		c.value();
	}

}

class Country{
	String name;
	
	void value(){
		name = "China";
	}
}

class City extends Country{
	String name;
	
	void value(){
		name = "³É¶¼";
		super.value();
		
		System.out.println(name);
		System.out.println(super.name);
		
	}
	
	
}