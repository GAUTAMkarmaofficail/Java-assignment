/*
14) Create a class MathOperation with two data member X and Y to store the operand and third data member R to store result of operation.Create method members
init - to input X and Y from user
add - to add X and Y and store in R
multiply - to multiply X and Y and store in R
power - to calculate X Y and store in R
display- to display Result R
*/


import java.util.Scanner;
class MathOperation{
  private int a,b;
  public MathOperation(int a, int b){
    this.a = a;
    this.b = b;
  }
  public MathOperation(){}

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

public void display()
{
     System.out.println("add :"+(a+b));
     System.out.println("mul :"+(a*b));
       {   
   int powe=1;
    for(int i=1;i<=b;i++)
     {
     powe=powe*a;
     }
    System.out.println("power :"+powe);
    }
  }

}
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 2 number for calulation");
    int x = sc.nextInt();
    int y = sc.nextInt();

  MathOperation obj = new MathOperation(x,y);// obj--> a=0,b=0
System.out.println("Before update and retrive data is :-> ");
    System.out.println("a prop: "+obj.getA()+" b props :"+obj.getB());
obj.display();


System.out.println("Try to update and retrive  the value for add,multiply,power ");
System.out.println("Enter 2 number");
    int a1 = sc.nextInt();
    int b1 = sc.nextInt();
 obj.setA(a1);
 obj.setB(b1);
System.out.println("After update and retrive ");
   System.out.println("a prop: "+obj.getA()+" b prop :"+obj.getB());
obj.display();



  }
}
