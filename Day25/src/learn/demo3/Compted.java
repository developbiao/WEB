package learn.demo3;

public class Compted {   //����һ��������Excption  �Ĳ���
	
	public int Method(int x, int y) throws MyException{
		if (x == 0){
			throw new MyException("��������Ϊ0!");
		}
		else if(y == 0){
			throw new MyException("����������Ϊ0!");
		}
		
		else {
			return x / y;
		}
	}

}
