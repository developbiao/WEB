/*
 * Practices:类的继承super
 * Author:Gongbiao
 * Date:2013-9-19
 */
class ExtendsDemo2
{
	public static void main(String[] args)
	{
		Zi z = new Zi();
		z.Function();
		
	}
}

class Fu
{
	//父类的构造函数的初始化
	Fu()
	{
		System.out.println("父类加载....");	
	}	
}

class Zi extends Fu
{
	//子类的构造函数中默认多有一条隐式的语句super();
	 void Function()
	 {
		 System.out.println("Function is runing!");

	 }	
}


/*
 * ——————————————————————————
 * 结论: 父类的构造函数，既可以给本类的对象初始化，也可以给子类对象初始化
 * ——————————————————————————
