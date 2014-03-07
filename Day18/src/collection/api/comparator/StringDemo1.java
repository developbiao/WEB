package collection.api.comparator;
/*
 * �����
 * ��һ���ַ�������(���а������ظ���Ԫ��)���г�����С���������
 */
public class StringDemo1 {
	
	public static void main(String[] args){
		String[] arr = {"abcd","zz","hahha","xxxxs","qq","mm","mm","hahah","qq"};
		sortStringArray(arr);
		
		
		
		String str = toString(arr);
		System.out.println(str);
	
	}	
	
	public static String toString(String[] arr) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if(i!= arr.length-1){
				sb.append(arr[i]+",");
			}
			else
				sb.append(arr[i]+"]");
		}
		return sb.toString() ;
	}

	public static void sortStringArray(String[] arr){
		//��Ԫ�ؽ�������
		for(int i=0; i<arr.length-1; i++){
			for(int j= i+1; j<arr.length; j++){
				if(arr[i].compareTo(arr[j])>0){
					swap(arr, i, j);
				}
			}
		}
	}

	public static void swap(String[] arr, int i, int j) {
		// Swap��������
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

}
