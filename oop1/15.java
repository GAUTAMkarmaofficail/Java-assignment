/*15) Create a class MathOperation containing method ‘multiply’ to calculate multiplication of following arguments.
two integers
three float
all elements of array
one double and one integer
*/


import java.util.Scanner;
class MathOperation{
  private double a,b,c;
  public MathOperation(int a, int b){
    this.a = a;
    this.b = b;
  }
 public MathOperation(float a,float b, float c){
    this.a = a;
    this.b = b;
    this.c = c;
  }
 public MathOperation(double a,int b){
    this.a = a;
    this.b = b;
   
  }
public MathOperation(double...a ){
    this.a = a;
    
   
  }
  public MathOperation(){}

  public void setA(double a){
    this.a = a;
  }
  public void setB(double b){
    this.b = b;
  }
public void setC(double c){
    this.c = c;
  }
  public double getA(){
    return a;
  }
  public double getB(){
    return b;
  }
 public double getC(){
    return c;
  }

public void muli()
{
    System.out.println("mul :"+(a*b));
    
}
public void mulf()
{
    System.out.println("mul :"+(a*b*c));
    
}
public void muldi()
{
    System.out.println("mul :"+(a*b));
    
}
public void muldA()
{
    System.out.println("mul :"+(a*b));
    
}
}
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 2 number for calulation");
    int x = sc.nextInt();
    int y = sc.nextInt();
MathOperation obj1 = new MathOperation(x,y);// obj--> a=0,b=0
  System.out.println("Before update and retrive data is :-> ");
    System.out.println("a prop: "+obj1.getA()+" b props :"+obj1.getB());
 obj1.muli();


  System.out.println("Enter 3 number for calulation");
    float x1 = sc.nextFloat();
    float y1 = sc.nextFloat();
    float z1 = sc.nextFloat();
MathOperation obj2 = new MathOperation(x1,y1,z1);
System.out.println("Before update and retrive data is :-> ");
    System.out.println("a prop: "+obj2.getA()+" b props :"+obj2.getB()+" c props :"+obj2.getC());
obj2.mulf();


    System.out.println("Enter 2 number for calulation");
    double x11 = sc.nextDouble();
    int y11 = sc.nextInt();
MathOperation obj11 = new MathOperation(x11,y11);// obj--> a=0,b=0
  System.out.println("Before update and retrive data is :-> ");
    System.out.println("a prop: "+obj11.getA()+" b props :"+obj11.getB());
 obj11.muldi();

System.out.println("Enter 2 number in array for calulation");
   int y13[]=new int[2];
 for(int i=0;i<=1;i++){
   
   y13[i] = sc.nextInt();
}
MathOperation obj13 = new MathOperation(y13);// obj--> a=0,b=0
  System.out.println("Before update and retrive data is :-> ");
   
 obj13.muldA();

/**********************************************************************************************************************/

System.out.println("Try to update and retrive  the value for multiply ");

    System.out.println("Enter 2 number for calulation");
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
  MathOperation obj3 = new MathOperation(x2,y2);// obj--> a=0,b=0
System.out.println("Before update and retrive data is :-> ");
    System.out.println("a prop: "+obj3.getA()+" b props :"+obj3.getB());

 obj3.muli();
  System.out.println("Enter 3 number for calulation");
    float x3 = sc.nextFloat();
    float y3 = sc.nextFloat();
    float z3 = sc.nextFloat();
MathOperation obj4 = new MathOperation(x3,y3,z3);
System.out.println("Before update and retrive data is :-> ");
    System.out.println("a prop: "+obj4.getA()+" b props :"+obj4.getB()+" c props :"+obj4.getC());


obj4.mulf();
    System.out.println("Enter 2 number for calulation");
    double x12 = sc.nextDouble();
    int y12 = sc.nextInt();
MathOperation obj12 = new MathOperation(x12,y12);// obj--> a=0,b=0
  System.out.println("Before update and retrive data is :-> ");
    System.out.println("a prop: "+obj12.getA()+" b props :"+obj12.getB());
 obj12.muldi();

  }
}
