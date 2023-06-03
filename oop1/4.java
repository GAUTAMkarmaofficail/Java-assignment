/*4)How to update and retrive  the value of a particular property of an object from anothor class(Let suppose the property is private) ?

*/
import java.util.Scanner;
class upre{
  private int a,b;
  public upre(int a, int b){
    this.a = a;
    this.b = b;
  }
  public upre(){}

  public void setA(int a){
    this.a = a;
  }
  public void setB(int b){
    this.b = b;
  }
  public int getA(){
    return a;
  }
  public int getB(){
    return b;
  }
 
}
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2 number");
    int x = sc.nextInt();
    int y = sc.nextInt();

   upre obj = new upre(x,y);// obj--> a=0,b=0
System.out.println("Before update and retrive ");
    System.out.println("a prop: "+obj.getA()+" b props :"+obj.getB());
System.out.println("Try to update and retrive  the value of a particular property of an object from anothor class");
System.out.println("Enter 2 number");
    int a1 = sc.nextInt();
    int b1 = sc.nextInt();
 obj.setA(a1);
 obj.setB(b1);
System.out.println("After update and retrive ");
   System.out.println("a prop: "+obj.getA()+" b prop :"+obj.getB());

  }
}
