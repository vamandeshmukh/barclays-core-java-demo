package com.barclays.corejava.demo.col;

import java.util.ArrayList;
import java.util.Iterator;

public class ColDemo2 {

	public static void main(String[] args) {

//		List Map Set Queue  

//		ArrayList myMarks = new ArrayList();
		ArrayList<Integer> myMarks = new ArrayList<>();

		System.out.println(myMarks.size());
		System.out.println(myMarks);

		myMarks.add(98);
//		myMarks.add(95.75);
//		myMarks.add("abc");
//		myMarks.add(false);
		myMarks.add(99);

		System.out.println(myMarks.size());
		System.out.println(myMarks);

		myMarks.add(97);

		System.out.println(myMarks.size());
		System.out.println(myMarks);

		myMarks.remove(2);

		System.out.println(myMarks.size());
		System.out.println(myMarks);

		for (Object marks : myMarks)
			System.out.println(marks);

		myMarks.forEach(e -> System.out.println(e.toString()));

		Iterator<Integer> it = myMarks.iterator();

		while (it.hasNext())
			System.out.println(it.next());

	}

}
