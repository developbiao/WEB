package collection.api.comparator;

public class SampleComparator implements Comparator {
	public int compare(Object o1, Object o2){
		return toInt(o1)-toInt(o2);
	}
	
	private int toInt(Object o){
		String str =(String)o;
		str = str.replace("һ", "1");
		str = str.replace("��", "2");
		str = str.replace("��","3");
		return Integer.parseInt(str);
	}
	
	/**
	 * ����
	 */
	public static void main(String[] args){
		String[]arry = new String[]{"һ��","��","��"};
		for(int i=0; i< arry.length; i++){
			System.out.println(arry[i]);
		}
	}

}
