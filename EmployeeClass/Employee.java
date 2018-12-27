import java.io.*;

public class Employee{
	String name;
	int age;
	String designation;
	double salary;
	// constructor of the class Employee
//private static double salary1=200;
 static double salary1=200;
// DEPARTMENT is a constant
public static final String DEPARTMENT = "Development ";

public Employee(String name){
	this.name = name;
}
//assign the age of the employee to the variable

public void empAge(int empAge){
	age = empAge;
}
// assign the designation to the variable designation
public void empDesignation(String empDesig){
	designation = empDesig;
}
// assign salary to the variable salary
public void empSalary(double empSalary){
	salary = empSalary;
}
// print employee details
public void printEmployee(){
	System.out.println("Name: "+ name);
	System.out.println("Age: "+ age);
	System.out.println("Designation: "+ designation);
	System.out.println("Salary: "+ salary);

}




}