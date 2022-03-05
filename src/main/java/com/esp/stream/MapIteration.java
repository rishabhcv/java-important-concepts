package com.esp.stream;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {

	public static void main(String[] args) {
		
		Map<String, Integer> nameMap = new HashMap<String, Integer>();
		nameMap.put("Rishabh", 1);
		nameMap.put("Ravi", 2);
		nameMap.put("Aman", 3);
		nameMap.put("Ankit", 4);
		
		nameMap.forEach((key, value)->System.out.println(key + " " +value));
		
		nameMap.entrySet().stream()
		.forEach(k-> System.out.println(k.getKey() + " " + k.getValue()));
		
		nameMap.entrySet().stream()
		.forEach(k-> System.out.println(k));
	}

}
