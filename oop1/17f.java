/*
17) Create a class Employee with(empNo ,salary and totalSalary)  with following features.
Only parameterized constructor;
totalSalary always represent total of all the salaries of all employees created.
empNo should be auto incremented.
display total employees and totalSalary using class method
*/
import java.util.Scanner;
class Employee{
  private int empNo;
  
  private int salary;
  private static int count=0, totalSalary;
  public Employee(int salary){
    this.empNo = ++count;
    this.salary = salary;
    totalSalary= totalSalary+this.salary;
  }

  

public static void display()
  {
    System.out.println("Total employees:"+count);
    System.out.println("Total employees:"+totalSalary);
  }

}
class Main{
  public static void main(String args[]){


  
   Employee e1= new Employee(40000);
   Employee e2= new Employee(30000);
   Employee.display();
 

  }
}
