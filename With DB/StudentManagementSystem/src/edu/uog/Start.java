package edu.uog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import edu.uog.student.Student;
import edu.uog.student.StudentDao;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student Management System");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 for Add");
			System.out.println("Press 2 for Delete");
			System.out.println("Press 3 for Display");
			System.out.println("Press 4 for Exit");
			int c = Integer.parseInt(br.readLine());

			if(c == 1) {
				System.out.println("Enter name: ");
				String name = br.readLine();
				
				System.out.println("Enter phone: ");
				String phone = br.readLine();
				
				System.out.println("Enter city: ");
				String city = br.readLine();
				
				// create student object to store student
				
				Student st = new Student(name, phone, city); 
				boolean answer = StudentDao.insertStudentToDB(st);
				if(answer) {
					System.out.println("Student is added");
				}
				else {
					System.out.println("Wrong");
				}
				System.out.println(st);
				
			}
			else if(c == 2) {
				System.out.println("DELETE");

			}
			else if(c == 3) {
				System.out.println("DISPLAY");

			}
			else if(c == 4) {
				System.out.println("EXIT");
				break;

			}
			else {
				System.out.println("NOTHING");

			}
		}

	}

}
