package collection.api;
import java.lang.reflect.Field;

//��ȡ�������
public class GetFields {
	
	public static void getFieldNames(String classname){
		
		try{
			//�������
			Class c = Class.forName(classname);
			//������е�����
			Field[] fds = c.getFields();
			
			for (int i=0; i<fds.length; i++){
				
				String fn = fds[i].getName();
				Class tc = fds[i].getType();
				String ft = tc.getName();
				System.out.println("�����Ե�����Ϊ��"+fn+",�����Ե�����Ϊ��"+ft);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		GetFields.getFieldNames("reflection.getfields.FieldInfo");  
	}

}
