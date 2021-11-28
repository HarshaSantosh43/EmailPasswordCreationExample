/**
 * 
 */
package com.sgk.learning.oops.javabeans;

/**
 * @author Santosh Katral
 *
 */
public class Employee {

	private String firstName;
	private String lastName;
	private String departmentName;

	public Employee() {
		
	}
	

	public Employee(String firstName, String lastName, String departmentName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentName = departmentName;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	
}
