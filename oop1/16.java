/*16) Create a class Person with properties (name and age) with following features.
Default age of person should be 18.
A person object can be initialized with name and age.
Method to display name and age of person.
*/
import java.util.Scanner;
class Person{
  private String a;
  private int b;
  public Person(String a, int b){
    this.a = a;
    this.b = b;
  }

  public Person(){
   this.a="Goutam" ;
   this.b=18;

}

  public void setA(String a){
    this.a = a;
  }
  public void setB(int b){
   
    this.b = b;
     
  }
 public String getA(){
    return a;
  }
  public int getB(){
    return b;
  }

public void display()
{
    System.out.println("Name:"+a);
     System.out.println("Age:"+b);
    
}


}
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

  Person obj1 = new Person();
    obj1.display(); 
   System.out.println(" updATE  ");
    System.out.println("Enter name ");
    String x = sc.nextLine();
     obj1.setA(x);
   System.out.println("Enter Age ");
   int y = sc.nextInt();
   obj1.setB(y);
    
 
//Person obj1 = new Person(x,y);// obj--> a=0,b=0
 obj1.display();

  }
}
