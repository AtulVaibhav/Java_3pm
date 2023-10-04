package com.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapCode {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("A",1);
		map.put("B",2);
		map.put("C",3);
		map.put("D",4);
		System.out.println(map);
		
		map.put("B", 20);
		System.out.println(map);
		
		//enhanced for
		for(Map.Entry<String,Integer> entry :map.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		//contains
		if(map.containsKey("B")){
			System.out.println(map.get("B"));
		}

	}

}



