/**
 * 
 */
package com.sgk.learning.oops.main;

import java.util.HashMap;
import java.util.Scanner;

import com.sgk.learning.oops.javabeans.Employee;
import com.sgk.learning.oops.services.CredentialService;

/**
 * @author Santosh Katral
 *
 */
public class MainApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int choice;
		String connection;
		Employee employee = null;

		HashMap<Integer, String> departmentsMap = new HashMap<Integer, String>();
		departmentsMap.put(1, "Technical");
		departmentsMap.put(2, "Admin");
		departmentsMap.put(3, "Human Resource");
		departmentsMap.put(4, "Legal");


		CredentialService credentialService = new CredentialService();

		do {
			System.out.println("Please enter Employee First Name");
			String firstName = scanner.next();
			System.out.println("Please enter Employee Last Name");
			String lastName = scanner.next();
			
			System.out.println("Please enter the department from the following" + "\n"
						+ "1: Technical" + "\n"
						+ "2: Admin" + "\n"
						+ "3: Human Resource" + "\n"
						+ "4: Legal");

			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				employee = new Employee(firstName, lastName, departmentsMap.get(choice));
				break;
			case 2:
				employee = new Employee(firstName, lastName, departmentsMap.get(choice));
				break;
			case 3:
				employee = new Employee(firstName, lastName, departmentsMap.get(choice));
				break;
			case 4:
				employee = new Employee(firstName, lastName, departmentsMap.get(choice));
				break;

			default:
				break;
			}

			String emailId = credentialService.generateEmailAddress(employee);
			credentialService.showCredentials(employee, emailId, credentialService.generatePassword());
			
			System.out.println("Do you want continue ? if yes press y else press any other key");
			connection = scanner.next();
		} while (connection.equalsIgnoreCase("y"));

	}

}
