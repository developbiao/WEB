class SingleDemo3
{
	public static void main(String[] args)
	{
		Rboot r1 = Rboot.Instance();
		r1.setAge(17);
		System.out.println(r1.getName());
		System.out.println(r1.getAge());
	
	}
}

class Rboot
{
	private int age;
	private String name;
	static Rboot boot = new Root("Ð¡éÙ×Ó");
	private Rboot(String name)
	{
		this.name = name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getAge()
	{
		return this.age;
	}

	public void getName()
	{
		return this.name;	
	}

	static public boot getInstance()
	{
		return boot;
	}


}
