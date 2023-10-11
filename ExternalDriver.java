/* Java Coding Exercise 1
   Fall 2023
   Student: Cole Dombrowski
   Date: 9/8/2023
 */
 
package dombrowski.jce1.external;

import dombrowski.jce1.students.Student;

public class ExternalDriver
{
    public static void main(String[] args)
    {
		// Declare a Student object
        Student eric;

		// Instantiate the Student object		
        eric = new Student("10002", "Eric", 'M', 3.7f);
		
		// Display student info without setting values to new
		// instance variables
        displayStudent(eric);
        
        // JCE1: Statement to set new instance variable
        eric.setAge(10);
        eric.age = 10;

		// Display student info after values have been set to
		// new instance variables
        displayStudent(eric);
    }

    public static void displayStudent(Student s)
    {
        System.out.println("********************************");
        System.out.print("Generated in StudentDriver Class");
        System.out.print("\nStudent Name: " + s.getName());
        System.out.print("\nUNT ID: " + s.getUNTID());
        System.out.print("\nGender: '" + s.getGender() + "'");
        System.out.println("\nGPA: " + s.getGPA());

        // Additional statement to display new variable
        System.out.println("\nAge: " + s.getAge());
        System.out.println("********************************\n");
    }
}
