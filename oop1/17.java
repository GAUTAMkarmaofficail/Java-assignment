/*
17) Create a class Employee with(empNo ,salary and totalSalary)  with following features.
Only parameterized constructor;
totalSalary always represent total of all the salaries of all employees created.
empNo should be auto incremented.
display total employees and totalSalary using class method
*/
import java.util.Scanner;
class Employee{
  private int a;
  private String b[];
  private int c[];
  public int sum=0;
  public Employee(int a,String b[], int c[]){
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public Employee(){}

  public void setA(int a){
    this.a = a;
  }
  public void setB(String b[]){
    this.b = b;
  }
public void setC(int c[]){
    this.c = c;
  }
 public int getA(){
    return a;
  }
  public String[] getB(){
    return b;
  }
public int[] getC(){
    return c;
  }

public void display()
{
    System.out.println("Total employees:"+a);
 
   for(int i=0;i<b.length;i++)
    {
     System.out.println((i+1)+" "+b[i]+" "+c[i]);
    }
     
    for(int ele: c)
    {
     sum=sum+ele;
    }
   System.out.println("TotalSalary:"+sum);
 
}


}
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Enter total no.. of empNO ");
    int x = sc.nextInt();
    String y[]=new String [x];
    int z[]=new int [x];
    for(int i=0;i<x;i++){
    System.out.println("Enter empName ");
       //sc.next();
     y[i] = sc.next();
   
    System.out.println("Enter salary ");
     z[i] = sc.nextInt();
   } 
 
 Employee obj1 = new Employee(x,y,z);// obj--> a=0,b=0
 obj1.display();

  }
}
