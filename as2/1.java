//1. Take values of length and breadth of a rectangle from user and check if it is square or not.
import java.util.Scanner;
class Main{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
   System.out.println(" Enter the Length and breath to check it is square or not ");
   float l =sc.nextFloat();
   float b =sc.nextFloat();
if(l==b)
System.out.println("It is square");
else
System.out.println("It is rectangle");
}
}
