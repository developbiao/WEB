package collection.api;
import java.util.Iterator;
import java.util.HashSet;

/*
 * ��hashSet�����д洢Person�������������������ͬ����Ϊͬһ���ˡ�        ����ͬԪ��     
 */
public class HashSetDemo2 {
	public static void main(String[] args){
		HashSet hs = new HashSet();
		/*
		 * HashSet �������ݽṹ�ǹ�ϣ�����Դ洢Ԫ�ص�ʱ��
		 * ʹ�õ�Ԫ�ص�hasCode������ȷ��λ�ã����λ����ͬ����ͨ��Ԫ�ص�equals������ȷ��
		 */
		hs.add(new Person("lisi4",24));
		//hs.add(new Person("lisi4",24));
		hs.add(new Person("lisi7",27));
		hs.add(new Person("lisi1",21));
		hs.add(new Person("lisi9",29));
		hs.add(new Person("lisi7",27));
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			Person p = (Person)it.next();
			System.out.println(p);
		}
		
		
		
	}

}
