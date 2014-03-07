package base04.com;

public class Mobile {
	public static void main(String[] args){
		
		//Nokia手机
		Nokia s411 = new Nokia();
		s411.Bluetooth();
		s411.CallNum();
		s411.SendMessage();
		
		System.out.println("---------------------");
		
		//我的Motorola手机
		Motorola me525 = new Motorola();
		me525.CallNum();
		me525.Bluetooth();
		int statu = me525.Status();
		
	   System.out.println("Motorola is runing>>" + statu);
		System.out.println("is ok !");
	}

}

//
interface Phone{
	void CallNum();
	int Status();
	void Bluetooth();
	void SendMessage();
}

//定义一个中间的abstract 抽象类

abstract class Stand  implements Phone{
	public void CallNum(){
		System.out.println("手机能打电话");
	}
	
	public void SendMessage(){
		System.out.println("发短息");
	}
}

class Nokia extends Stand implements Phone{
	public int Status(){
		return 1;
	}
	
	public void Bluetooth(){
		System.out.println("蓝牙Buletooth");
	}
	
}

class Motorola extends Stand implements Phone{
	public int Status(){
		return 3;
	}
	
	public  void Bluetooth(){
		System.out.println("Buletooth3.0");
	}
	
	public void CallNum(){
		System.out.println("Hello Moto!");
	}
	
}
