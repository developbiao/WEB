package base04.com;

public class Demo_07 {
	
	public static void main(String[] args){
		//�쳣�ĳ��ֳ���ʱ��
		
	
		
		Demo_07 d = new Demo_07();
		//1���쳣��Ӧ��
		try{
			d.one(0, 0);
		}catch(AandBIsZeroException e){
			System.out.println("һԪһ�η�������������");
		}catch(AIsZeroException e){
			System.out.println("һԪһ�η�����������ʵ����");
		}
		
		System.out.println("is ok!");
	}
	
	void one(int a, int b){
		if(a==0 && b==0){
			throw new AandBIsZeroException();
			
		}
		
		if(a==0){
			throw new AIsZeroException();
		}
		
		System.out.println("�����:" + -a/b);
	}

}

//�Զ����쳣��
class AandBIsZeroException extends RuntimeException{
	
}

class  AIsZeroException extends RuntimeException{
	
}

