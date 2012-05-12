package com.craigpardey.distribution;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Distribution {

	public void doDistribution(String s) {
		Map<String, String> graph = parse(s);
		for(Iterator<Entry<String, String>> iterator = graph.entrySet().iterator(); iterator.hasNext();){
			Entry<String, String> entry = iterator.next();
			System.out.println(String.format("%s: %s", entry.getKey(), entry.getValue()));
		}
	}
	
	public Map<String, String> parse(String s) {
		Map<String, String> map = initMap();
		if (s != null) {
			for (int i = 0; i < s.length(); i++) {
				String key = String.valueOf(s.charAt(i));
				String val = map.get(key);
				map.put(key, val + "*");
			}
		}
		return map;
	}

	public Map<String, String> initMap() {
		Map<String, String> map = new TreeMap<String, String>();
		for (int i = 0; i < 10; i++) {
			map.put(String.valueOf(i), "");
		}
		return map;
	}
}
