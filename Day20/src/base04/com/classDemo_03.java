package base04.com;

public class classDemo_03 {
	
	public static void main(String args[]){
		classDemo_03 d = new classDemo_03();
		
		   //�������� �ĵ���
		d.doTing(new Myinter(){
			public void Method(){
				System.out.println("����������óɹ���");
			}
		} );
		
		
		System.out.println("is ok !");
	}
	
	
	// this method
	void doTing(Myinter m){
		m.Method();
	}

}

interface Myinter{
	void Method();
}
