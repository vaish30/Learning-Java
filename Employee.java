public class Employee {

String name;
int age;
String designation;
double salary;

public Employee(String name){

this.name = name;

}

public void empAge(int empAge){

age = empAge;

}

public void empDesignation( String empDesig){

designation = empDesig;

}

public void empSalary (double empSal){

salary = empSal;

}


public void printEmployee (){
System.out.println("Name of the employee is" + name);
System.out.println("Age of the employee is" + age);
System.out.println("Designation of the employee is" + designation);
System.out.println("Salary of the employee is " + salary);
}

public static void main(String args[])
{
Employee myemp = new Employee("Vaishnave");
Employee secemp = new Employee("Shipra");


myemp.empAge(20);
myemp.empDesignation("Developer");
myemp.empSalary(25000);
myemp.printEmployee();


secemp.empAge(21);
secemp.empDesignation("Developer");
secemp.empSalary(25000);
secemp.printEmployee();

}
}





