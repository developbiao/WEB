package api.Day19.Demo;

//��̬Ӧ����ϰ��
public class Demo11 {
	public static void main(String[] args){
		MyFactory ft= new MyFactory();
		ft.getInst();
		for(int i=0;i<10; i++){
			ft.getInst().function();
		}

	}
}

interface MyInter{
	void function();
}

class MyFactory{   //������
	public MyInter getInst(){
		return new ImpleDemo2();
		
	}
}

class ImpleDemo1 implements MyInter{
	
	public void function(){
		System.out.println("ʹ��A�����ݿ⿪���ĳ���");
	}
	
}

class ImpleDemo2 implements MyInter{
	public void function(){
		System.out.println("ʹ��B�����ݿ⿪���ĳ���");
	}
}



