package com.company.ex9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex9 {

	public static void main(String [] args){
		List list = new ArrayList();
		Map map = new HashMap();
		Set set = new HashSet();

		Collections.unmodifiableSet(set);
		Collections.unmodifiableMap(map);
		List newUnmodifiableList =  Collections.unmodifiableList(list);
	}
}
