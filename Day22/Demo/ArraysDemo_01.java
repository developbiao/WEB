/**
 * @Discribe:Arrays ��ѧϰ,����ת����
 * @Date:2014-01-14
 * @Author:GongBiao
 */


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class ArraysDemo_01{

	public static void main(String[] args){
		//int[] arr = {11,23,73, 44,89,66};
		//System.out.println(Arrays.toString(arr));
		//
		//����ת����

		String[] str = {"abc1", "abc2", "abc3", "abc4"};

		List<String> list = Arrays.asList(str);
		System.out.println(list);
		


	
		System.out.println("is ok !");

		//�������
		Integer[] nums = {1,3,5,7,9,11};

		List<Integer>list2 = Arrays.asList(nums);
		System.out.println(list2.size());
	}
}
