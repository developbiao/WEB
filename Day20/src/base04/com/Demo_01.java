package base04.com;

public class Demo_01 {
	
	public static void main(String[] args){
		
		Lilasi lila = new Lilasi();
		lila.Fly();
		lila.Super();
		
		
		System.out.println("this ok !");
	}

}

//���˽ӿ�
interface IronMan{
	void Fly();
	int Status();
	void Super();
}

//Midde �м�ĳ��󷽷�
abstract class Loading implements IronMan{
	public void Fly(){
		System.out.println("I USE Fly!");
	}
}

//��һ��IronMan

class Gongbiao extends Loading implements IronMan{   //�ȼ̳к�ʵ��
	public int Status(){
		return 1;
	}
	
	public void Super(){
		System.out.println("I am Super Man!");
	}
}

//�ڶ���IronMan

class Lilasi extends Loading implements IronMan{
	
	public int Status(){
		return 0;
	}
	public void Super(){
		System.out.println("I am  Lilasi");
	}
	
}


