/**
 * @Discribe:�Զ����ָ���쳣
 * @Author:GongBiao
 * @Date:2014/02/06
 */
package api.io.bean;

public class MyFileException extends NullPointerException {

	public MyFileException() {
		
		System.out.println("�ļ������ڣ�����...");
	}

	public MyFileException(String msg) {
		super(msg);
		System.out.println(msg);
		// TODO Auto-generated constructor stub
	}
	
	

}
