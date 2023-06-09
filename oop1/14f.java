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
    private int x, y;
    private double r;
    public void init(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter X and Y");
      x = sc.nextInt();
      y = sc.nextInt();
    }
    public void add(){
        r = x + y;
    }
    public void multiply(){
        r = x * y;
    }
    public void power(){
        r = Math.pow(x,y);
    }
    public void display(){
        System.out.println("Result : "+r);
    }
}
class TestMain{
    public static void main(String args[]){
      MathOperation obj = new MathOperation();// obj->x,y,r;
      obj.init(); // obj-> x=2,y=4,r=0
      
      obj.add(); // obj-> x=2, y=4,r=6
      obj.display();

      obj.multiply(); // x=2,y=4,r=8
      obj.display();
      
      obj.power(); // x=2,y=4,4=16
      obj.display();       
    }
}
