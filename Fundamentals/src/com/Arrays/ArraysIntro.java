package com.Arrays;

//Object: equals,hashCode,toString
public class ArraysIntro {

	public static void main(String[] args) {
		//What is an array: homogeneous(similar type) data structure
         
		//creating an array
		//dataType[] nameOfArray = {e1,e2,e3,...,en};//
		//dataType nameOfArray[] = {e1,e2,e3,...,en};
		
		int[] arr = {1,2,3,4,5};
		System.out.println(arr.hashCode());//integer representation of array obj
	
	    Object[] arr2 = {1,1.2f,1.23,'c',"hello"};
	    
	    //2nd way:
	    // dataType[] nameOfArray = new dataType[size];//declaration
	    // Index:0-5
	    // nameOfArray[index] = value;
	    
	    int[] arr3 = new int[6];
	    arr3[0] = 21;
	    arr3[1] = 21;
	    arr3[2] = 21;
	    arr3[3] = 21;
	    arr3[4] = 21;
	    arr3[5] = 21;
	    //length = lastIndex+1
	    //static in nature
	    //always starts with 0 as index
	    //length = number of element
	    
	    
	    //Read an array(Accessing element)
	    int[] arr4 = {21,31,41,51};
	    //indexing
	   // System.out.println(arr4[arr4.length-1]);//arr[4-1] = arr[3]
	    
	    System.out.println(arr4[0]);
	    System.out.println(arr4[1]);
	    System.out.println(arr4[2]);
	    System.out.println(arr4[3]);
	    
	    for(int i=0;i<arr4.length;i++)
	    	System.out.println(arr4[i]);
	    
	    //Enhanced for-loop: array like structure
	   // for(dataType var : arrName)
	    for(int data : arr4){
	    	System.out.println(data);
	    }
	    
	}
	  
}
