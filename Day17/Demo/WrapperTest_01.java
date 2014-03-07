/**
 * @Discribe:����������
 * @Date:2014-01-09
 * @Author:GongBiao
 */
import java.util.Arrays;
class WrapperTest_01{
	private static final String SPACE=" ";

	public static void main(String[] args){
	
		String str = "34 9 -7 12 69 25";

		str = sortStringNumber(str);
		System.out.println(str);

		System.out.println("is ok!");
	}

	public static String sortStringNumber(String str){
	
		String[] str_nums = toStringArray(str);

		int[]nums = toIntArray(str_nums);

		sortIntArray(nums);

		return arrayToString(nums);
	}


	/*
	 * ���ַ���ת���ַ�������
	 */
	private static String[] toStringArray(String str){
	
		return str.split(SPACE);
	}

	/*
	 * ���ַ�������ת����int ����
	 */
	private static int[] toIntArray(String[] str_nums){
	
		int[] arr = new int[str_nums.length];
		
		for(int i=0; i< str_nums.length; i++){
		
			arr[i] = Integer.parseInt(str_nums[i]);
		}

		return arr;
	}

	/*
	 * ����������
	 */
	
	private static void sortIntArray(int[] nums){
	
		Arrays.sort(nums);	
	} 

	/*
	 * ������ת�����ַ���
	 */

	private static String arrayToString(int[] nums){
	
		//1�������ַ���������
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<nums.length; i++){
			if(i != nums.length-1){
				sb.append(nums[i] + SPACE);

			}

			else{
			
				sb.append(nums[i]);
			}
		
		}

		return sb.toString();
	}




}
