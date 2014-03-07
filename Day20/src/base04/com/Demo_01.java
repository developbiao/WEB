package base04.com;

public class Demo_01 {
	
	public static void main(String[] args){
		
		Lilasi lila = new Lilasi();
		lila.Fly();
		lila.Super();
		
		
		System.out.println("this ok !");
	}

}

//超人接口
interface IronMan{
	void Fly();
	int Status();
	void Super();
}

//Midde 中间的抽象方法
abstract class Loading implements IronMan{
	public void Fly(){
		System.out.println("I USE Fly!");
	}
}

//第一个IronMan

class Gongbiao extends Loading implements IronMan{   //先继承后实现
	public int Status(){
		return 1;
	}
	
	public void Super(){
		System.out.println("I am Super Man!");
	}
}

//第二个IronMan

class Lilasi extends Loading implements IronMan{
	
	public int Status(){
		return 0;
	}
	public void Super(){
		System.out.println("I am  Lilasi");
	}
	
}


