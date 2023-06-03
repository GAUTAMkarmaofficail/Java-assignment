/*
19) Make list of Students having name, roll no., age, score. Write a program to accept 10 students record and arrange the Students based on the score group [0-50], [50-65],[65-80],[80-100].
*/

import java.util.Scanner;
class Student{
  private int b[],c[],d[],max,max1=0;
  private String a[];
  public int sum=0;
  int k[]=new int [3];
  public Student(String a[], int b[],int c[],int d[]){
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
  }

  public Student(){}

  public void setA(String a[]){
    this.a = a;
  }
  public void setB(int b[]){
    this.b = b;
  }
  public void setC(int C[]){
    this.c = c;
  }
 public void setD(int d[]){
    this.d = d;
  }
 public String[] getA(){
    return a;
  }
  public int[] getB(){
    return b;
  }
 public int[] getC(){
    return c;
  }
 public int[] getD(){
    return d;
  }
	
    
public void display1()
{
    System.out.println("Total Students :  3");
  
  for(int i=0;i<3;i++)
     
      System.out.println( (i+1)+" Student rollNo "+b[i]+" Name "+a[i]+" Score "+d[i]+"age "+c[i]);

     
 
 
    
}
public void display()
{
    System.out.println("Total Students :  3");
  int temp;
  for(int i=0;i<3;i++)
     for(int j=i+1;j<3;j++)
     {
      if(d[i]<d[j])
      
      temp=d[i];
      d[i]=d[j];
      d[j]=temp;
      System.out.println( (i+1)+" Student rollNo "+b[i]+" Name "+a[i]+" Score "+d[i]+"age "+c[i]);

     }
 
 
    
}


}
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String x[]=new String [3];
    int y[]=new int [3];
    int z[]=new int [3];
    int t[]=new int [3];
    System.out.println("Enter 10 Student name ");
    for(int i=0;i<3;i++){
     
     System.out.println("Enter "+(i+1)+"  Student name ");
     x[i] = sc.next();
     System.out.println("Enter "+(i+1)+"  Student roll no. ");
     y[i] = sc.nextInt();
     System.out.println("Enter "+(i+1)+"  Student age ");
     z[i] = sc.nextInt();
     System.out.println("Enter "+(i+1)+"  Student score ");
     t[i] = sc.nextInt();
}
    
    
    
   
 
 Student obj1 = new Student(x,y,z,t);// obj--> a=0,b=0
 obj1.display1();
 obj1.display();

  }
}


