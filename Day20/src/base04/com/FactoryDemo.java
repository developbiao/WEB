package base04.com;

public class FactoryDemo {
	public static void main(String[] args){
		
		new Factory().Tools().DataDemo();
		new Factory().Tools().DataDemo();
		new Factory().Tools().DataDemo();
		
		System.out.println("is ok!");
	}

}

interface Database{
	void DataDemo();
}

//Factory tools Class

class Factory{
	public static Database Tools(){
		return new Mysql();
	}
}

class Sqlserver implements Database{
	public void DataDemo(){
		System.out.println("使用SQLSERVER开发的软件");
	}
}

class Mysql implements Database{
	public void DataDemo(){
		System.out.println("使用Mysql开发的软件");
	}
}
