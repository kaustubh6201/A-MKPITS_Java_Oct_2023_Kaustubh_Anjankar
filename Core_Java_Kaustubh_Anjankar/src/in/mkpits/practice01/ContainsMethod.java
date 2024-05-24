package in.mkpits.practice01;

import java.util.ArrayList;

public class ContainsMethod {

	public static void main(String[] args) {
	
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		list1.add("red"); list1.add("yellow");
		list2.add("Red"); list2.add("pink");
		
		ArrayList<String> result = new ArrayList<String>();
		for (String string : list1) {
			result.add(list2.contains(string)?"yes":"no");
		}
		System.out.println(result);
	}

}
