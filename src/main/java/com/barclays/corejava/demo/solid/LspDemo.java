package com.barclays.corejava.demo.solid;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.barclays.corejava.demo.str.Employee;


//----------------
//SOLID Principles 
//----------------
//Single Responsibility Principle (SRP)
//Open / Close Pinciple (OCP)
//Liscove's Substitution Principle (LSP)
//Interfaces Segregartion Principle (ISP)
//Dependency Inversion Principle (DIP)	
//
//
//Single Responsibility Principle (SRP)
//
//Open / Close Pinciple (OCP)
//
//Liscove's Substitution Principle (LSP)
//
//Interfaces Segregartion Principle (ISP)
//
//Dependency Inversion Principle (DIP)	


public class LspDemo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList = new LinkedList<>();

		ArrayList<Employee> empList2 = new ArrayList<>();

//		empList2 = new LinkedList<Employee>();

		System.out.println(empList.toString());
		System.out.println(empList2.toString());

	}

}
