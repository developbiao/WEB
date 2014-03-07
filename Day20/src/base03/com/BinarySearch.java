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
	 
	 //二分查找法
	 
	 public static void find(int leftIndex,int rightIndex,int val,int[] arr){  
		  //首先找到中间的数  
		  int midIndex=(rightIndex+leftIndex)/2;  
		  int midVal=arr[midIndex];  
		    
		  if(rightIndex>=leftIndex){  
		  //如果要找的数比midVal大  
		   if(midVal>val){  
		    //在arr左边数中找  
		    find(leftIndex,midIndex-1,val,arr);  
		   }else if(midVal<val){  
		    //在arr的右边去查找  
		    find(midIndex+1,rightIndex,val,arr);  
		   }else if(midVal==val){  
			   System.out.println("找到了下标"+midIndex + "这个数是" + arr[midIndex]);  
		   }  
		  }else{  
		   System.out.println("没有该数!");  
		  }  
		 } 
}