package base03.com;

import java.util.Arrays;

public class BinarySearch {  
	
	   
	 public static void main(String[] args) {  
	    
	  int[] arr=new int[10];  
	  for (int i = 0; i < 10; i++) {  
	   arr[i]=(int)(Math.random()*100);
	    System.out.print(arr[i] + "\t");
	  }  
	  
	  System.out.println();
	  Arrays.sort(arr);
	    
	   for(int i=0; i<arr.length; i++){
		   System.out.print(arr[i] + "\t");
	   }
	   
	   
	  find(0, arr.length-1, 33 ,arr);

	
	  
	}  
	 
	 //���ֲ��ҷ�
	 
	 public static void find(int leftIndex,int rightIndex,int val,int[] arr){  
		  //�����ҵ��м����  
		  int midIndex=(rightIndex+leftIndex)/2;  
		  int midVal=arr[midIndex];  
		    
		  if(rightIndex>=leftIndex){  
		  //���Ҫ�ҵ�����midVal��  
		   if(midVal>val){  
		    //��arr���������  
		    find(leftIndex,midIndex-1,val,arr);  
		   }else if(midVal<val){  
		    //��arr���ұ�ȥ����  
		    find(midIndex+1,rightIndex,val,arr);  
		   }else if(midVal==val){  
			   System.out.println("�ҵ����±�"+midIndex + "�������" + arr[midIndex]);  
		   }  
		  }else{  
		   System.out.println("û�и���!");  
		  }  
		 } 
}