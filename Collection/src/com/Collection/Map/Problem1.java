package com.Collection.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Problem1 {
   public static void getCount(int[] arr){
	   Map<Integer,Integer> map = new LinkedHashMap<>();
	   for(int data:arr){
		   if(!map.containsKey(data)){
			   map.put(data, map.getOrDefault(data, 1));
		   }else{
			   map.put(data, map.get(data)+1);
		   }
	   }
	   System.out.println(map);
   }
   public static void firstNonRepeatingNumber(int[] arr){
	   Map<Integer,Integer> map = new LinkedHashMap<>();
	   for(int data:arr){
		   if(!map.containsKey(data)){
			   map.put(data, map.getOrDefault(data, 1));
		   }else{
			   map.put(data, map.get(data)+1);
		   }
	   }
	   for(Map.Entry<Integer, Integer> entry : map.entrySet()){
		   if(entry.getValue()==1){
			   System.out.println(entry.getKey());
			   break;
		   }
	   }
   }
	public static void main(String[] args) {
		int[] arr = {1,2,1,3,2,3,1,2,3};
		getCount(arr);
		
		int[] arr2 = {1,2,1,3,7,2,3,1,8,2,3};
		firstNonRepeatingNumber(arr2);
		
		

	}

}
