/*
5) Create an Object having two properties and four behaviours(add,substract,multiply,divide) 
to perform desired operation.object must have setter and getter and keep all properties private.
*/
import java.util.Scanner;
class Asmd{
  private int a,b;
  public Asmd(int a, int b){
    this.a = a;
    this.b = b;
  }
  public Asmd(){}

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
  public void add()
{
    System.out.println("add :"+(a+b));
}
public void mul()
{
    System.out.println("mul :"+(a*b));
}
public void sub()
{
    System.out.println("sub :"+(a-b));
}
public void div()
{
    System.out.println("Div :"+(a/b));

}
}
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 2 number for calulation");
    int x = sc.nextInt();
    int y = sc.nextInt();

  Asmd obj = new Asmd(x,y);// obj--> a=0,b=0
System.out.println("Before update and retrive data is :-> ");
    System.out.println("a prop: "+obj.getA()+" b props :"+obj.getB());
obj.add();
obj.mul();
obj.sub();
obj.div();
System.out.println("Try to update and retrive  the value for add,substract,multiply,divide ");
System.out.println("Enter 2 number");
    int a1 = sc.nextInt();
    int b1 = sc.nextInt();
 obj.setA(a1);
 obj.setB(b1);
System.out.println("After update and retrive ");
   System.out.println("a prop: "+obj.getA()+" b prop :"+obj.getB());
obj.add();
obj.mul();
obj.sub();
obj.div();


  }
}
