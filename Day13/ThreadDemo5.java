/*
 * Pracitce:Thread练习
 */

class Person extends Thread
{
	private String name;
	Person(String name)
	{
		super();
		this.name = name;
	}	

	public void run()
	{
		for(int i=0; i<=10; i++)
			System.out.println("name"+name+"----:"+i+Thread.currentThread().getId());
	}
}

class ThreadDemo5
{
	public static void main(String args[])
	{
		Person p1 = new Person("王二小");
		Person p2 = new Person("小橘子");
		p1.start();
		p2.sleep(5000);
		System.out.println("run over");	
	}
}
