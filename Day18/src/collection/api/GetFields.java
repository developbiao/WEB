package collection.api;
import java.lang.reflect.Field;

//获取类的属性
public class GetFields {
	
	public static void getFieldNames(String classname){
		
		try{
			//获得类名
			Class c = Class.forName(classname);
			//获得所有的属性
			Field[] fds = c.getFields();
			
			for (int i=0; i<fds.length; i++){
				
				String fn = fds[i].getName();
				Class tc = fds[i].getType();
				String ft = tc.getName();
				System.out.println("该属性的名字为："+fn+",该属性的类型为："+ft);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		GetFields.getFieldNames("reflection.getfields.FieldInfo");  
	}

}
