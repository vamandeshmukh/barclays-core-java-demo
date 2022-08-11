package com.barclays.corejava.demo.str;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(101, "Sonu", 90000));
		empList.add(new Employee(102, "Monu", 95000));
		empList.add(new Employee(103, "Tonu", 85000));
		empList.add(new Employee(104, "Ponu", 80000));
		empList.add(new Employee(105, "Gonu", 99000));

		System.out.println("empList with forEach()");
		empList.forEach(e -> System.out.println(e.toString()));

	}

}
