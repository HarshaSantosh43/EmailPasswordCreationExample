/**
 * 
 */
package com.sgk.learning.oops.services;

import java.security.SecureRandom;

import com.sgk.learning.oops.javabeans.Employee;

/**
 * @author Santosh Katral
 *
 */

public class CredentialService {
	private final String companyName = ".sgklearning.com";
	private final String emailSign = "@";
	private final String whiteSpace = " ";
	private final int length = 8;
	private String generatedPassword;

	public String generatePassword() {
		final String passwordCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$&*";
		SecureRandom secureRandom = new SecureRandom();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < length; i++) {
			int randomIndex = secureRandom.nextInt(passwordCharacters.length());
			stringBuilder.append(passwordCharacters.charAt(randomIndex));
		}
		return stringBuilder.toString();
	}

	public String generateEmailAddress(Employee employee) {
		String emailId = (employee.getFirstName() + employee.getLastName() + emailSign + employee.getDepartmentName()
				+ companyName).toLowerCase().replaceAll(whiteSpace, "");
		System.out.println("Employee email id is: " + emailId + "\n");
		return emailId;
	}

	public void showCredentials(Employee employee, String emailId, String password) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are: " + "\n" + "Email Id: "
				+ emailId + "\n" + "Password: " + password + "\n");
	}
}
