import java.io.*; // import all classes available in directory java_installation/java/io

public class EmployeeTest{
	
public static void main(String args[]){
	/* create two objects using constructor */

	Employee empOne = new Employee("Inoussa");
	Employee empTwo = new Employee("Mouiche");
// invoking methods for each object created
	empOne.empAge(27);
	empOne.empDesignation("Senior Software Engineer");
	empOne.empSalary(9000);
	empOne.printEmployee();

	empTwo.empAge(28);
	empTwo.empDesignation("Software Engineer");
	empTwo.empSalary(500);
	empTwo.printEmployee();

Employee.salary1 = 1000;
System.out.println(Employee.DEPARTMENT + "average salary:" + Employee.salary1);

}	
}	
