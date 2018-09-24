package beginner;
import java.io.*;
public class Employee {

	String name;
	int age;
	String designation;
	double salary;
	
	int a=63;
	int b=13;
	int f=679;
	int h=5;
	int g=f>>3;
	String y= Integer.toBinaryString(f);
	String d= Integer.toBinaryString(g);
	int c=a&b;
	
	String binary=Integer.toBinaryString(a);
	
	
	public Employee() {
	
	}
	
	//This is the constructor for the class Employee
	public Employee(String name) {
		this.name=name;
	}
	
	//Assign the age of the Employee to the variable age
	public void empAge(int empAge) {
		age=empAge;
	}
	
	//Assign the designation to the variable designation
	public void empDesignation(String empDesign) {
		designation=empDesign;
	}
	//Assign the salary to the variable salary
	public void empSalary(double empSalary) {
		salary=empSalary;
	}
	
	/*Print the Employee details*/
	public void printEmployee() {
		h =h+a;
		System.out.println("Name:"+name);
		System.out.println("Age"+age);
		System.out.println("Designation:" + designation );
	    System.out.println("Salary:" + salary);
	    System.out.println("The result is: "+ y);
	    System.out.println("The result is: "+ h );
	}
}
