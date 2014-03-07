package collection.api.comparator;

public class SampleComparator implements Comparator {
	public int compare(Object o1, Object o2){
		return toInt(o1)-toInt(o2);
	}
	
	private int toInt(Object o){
		String str =(String)o;
		str = str.replace("一", "1");
		str = str.replace("二", "2");
		str = str.replace("三","3");
		return Integer.parseInt(str);
	}
	
	/**
	 * 测试
	 */
	public static void main(String[] args){
		String[]arry = new String[]{"一二","三","二"};
		for(int i=0; i< arry.length; i++){
			System.out.println(arry[i]);
		}
	}

}
