package com.Day34;

import java.util.ArrayList;
/**
 * ArrayList for the employee database
 */
public class EmployeeDB {

	static ArrayList<EmployeePayroll> employeeDB = new ArrayList<EmployeePayroll>();
	
	public static ArrayList<EmployeePayroll> getEmployeeDB() {
		return employeeDB;
	}
}