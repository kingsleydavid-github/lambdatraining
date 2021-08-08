package javatraining.coretraining;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//1
public final class Immut {
	
	// 5 no setters
	public String getName() {
		return name;
	}
	public Integer getSid() {
		return sid;
	}
	public Map<String, String> getTempMap() {
		//4
		return (Map<String, String>) tempMap.clone();
	}
	
	//2, 3
	private final String name;
	private final Integer sid;
	private final HashMap<String, String> tempMap;
	
	public Immut(String name, Integer sid, Map<String, String> map) {
		this.name = name;
		this.sid = sid;
		this.tempMap = new HashMap<>();
		
		//6 deepcopy
		Iterator<Entry<String, String>> mapItr =  map.entrySet().iterator();
		while(mapItr.hasNext()) {
			Entry<String, String> ent = mapItr.next();
			tempMap.put(ent.getKey(), ent.getValue());
		}
		
	}
	
	
	

}
