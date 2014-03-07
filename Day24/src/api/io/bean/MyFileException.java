/**
 * @Discribe:自定义空指针异常
 * @Author:GongBiao
 * @Date:2014/02/06
 */
package api.io.bean;

public class MyFileException extends NullPointerException {

	public MyFileException() {
		
		System.out.println("文件不存在，请检查...");
	}

	public MyFileException(String msg) {
		super(msg);
		System.out.println(msg);
		// TODO Auto-generated constructor stub
	}
	
	

}
