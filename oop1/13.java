/*13) Create a class to calculate Area of circle with one data member to store the radius and another to store area value. Create method members
init - to input radius from user
calc - to calculate area
display- to display area
*/

import java.util.Scanner;
class Arci{
  private int a;
  public Arci(int a){
    this.a = a;
    
  }
  public Arci(){}

  public void setA(int a){
    this.a = a;
  }

  
  public int getA(){
    return a;
  }

  
  public void area()
{
    System.out.println(" Area of circle:"+(3.14f*a*a));
}


}
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter radius");
    int x = sc.nextInt();
 

  Arci obj = new Arci(x);// obj--> a=0,b=0
System.out.println("Before update and retrive data is :-> ");
    System.out.println("radius: "+obj.getA());
obj.area();

System.out.println("Try to update and retrive  the radius ");
System.out.println("Enter radius");
    int a1 = sc.nextInt();

 obj.setA(a1);

System.out.println("After update and retrive ");
   System.out.println("new radius: "+obj.getA());
obj.area();


  }
}
