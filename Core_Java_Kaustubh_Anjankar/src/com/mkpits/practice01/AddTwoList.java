package com.mkpits.practice01;

import java.util.ArrayList;

public class AddTwoList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		 
		list.add(20);
		list.add(10);
		list.add(25);
		list.add(12);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(17);
		list2.add(18);
		list2.add(19);
		list2.add(21);
		
		list.addAll(list2);
		
		System.out.println(list);
		

	}

}
