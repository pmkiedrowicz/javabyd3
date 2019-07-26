package com.sda.javabyd3.lusi.introduction.generics.ex14;

public class Main {
	public static void main(String[] args) {
		Clipboard<Employee> employeeClipboard = new Clipboard<>();
		employeeClipboard.insertIntoClipboard(Employee.builder().name("Jan").surname("Kowalski").companyName("SDAcademy").build());

		Clipboard<Teacher> teacherClipboard = new Clipboard<>();
		teacherClipboard.insertIntoClipboard(Teacher.builder().name("Jan").surname("Kowalski").school("IV LO").degree("mgr inż.").build());
	}
}
