/*
12.A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
INPUT : 1234        OUTPUT : 4321
INPUT : 5982        OUTPUT : 2895 
*/
import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the digit 4 digit number to reverse");
      int r=sc.nextInt();

      int t,t1,t2,t3,x,x1,x2 ;                                                                      
      t=r%10;
       
      x=r/10;
      t1=x%10;
      
      x1=x/10;
      t2=x1%10;
      
      x2=x1/10;
      t3=x2%10;
      
      
      
      
     
    System.out.println("After resverse");
    System.out.print(t);
    System.out.print(t1);
    System.out.print(t2);
    System.out.println(t3);





}
}
