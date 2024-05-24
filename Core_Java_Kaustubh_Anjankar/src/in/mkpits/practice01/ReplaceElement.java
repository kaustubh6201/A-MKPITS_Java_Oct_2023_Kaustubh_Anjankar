package in.mkpits.practice01;

import java.util.ArrayList;

public class ReplaceElement {

	public static void main(String[] args) {
	
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(12);
		num.add(10);
		num.add(3);
		num.add(7);
		
		for (Integer integer : num) {
			System.out.println(integer);
		}
		
		num.set(2, 100);
		
		System.out.println(num);

	}

}
