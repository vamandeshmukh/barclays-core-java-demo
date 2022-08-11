package com.barclays.corejava.demo.str;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(101, "Sonu", 90000));
		empList.add(new Employee(102, "Monu", 95000));
		empList.add(new Employee(103, "Tonu", 85000));
		empList.add(new Employee(104, "Ponu", 80000));
		empList.add(new Employee(105, "Gonu", 99000));

		System.out.println("All employees using forEach()");
		empList.forEach(e -> System.out.println(e.toString()));

//		System.out.println("Employees with salary > 90000");
//		empList.forEach(e -> {
//			if (e.getSalary() > 90000)
//				System.out.println(e.toString());
//		});

		// fullform
		Stream<Employee> empStream = empList.stream();
		List<Employee> firstThreeEmps = empStream.limit(3).collect(Collectors.toList());

//		limit() skip() map() 

		// shortcut
//		List<Employee> firstThreeEmps = empList.stream().limit(3).collect(Collectors.toList());

		System.out.println("Only first three Employees");
		firstThreeEmps.forEach(e -> System.out.println(e.toString()));

	}

}
