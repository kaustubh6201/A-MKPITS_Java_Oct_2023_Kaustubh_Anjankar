package com.mkpits.practice01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(15);
		list.add(8);
		list.add(5);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}

	}

}
