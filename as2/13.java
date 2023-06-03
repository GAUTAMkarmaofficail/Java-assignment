/*
13. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
Test Data
Input number: 3
Expected Output :
Wednesday
*/

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
             System.out.println("Only for numeric value ");
             System.out.println("*************************************");          
             System.out.println("Enter day number between(1-7)");
             int a=sc.nextInt();
          
      switch(a) {
    case 1:
      System.out.println("today is Monday:");
     break;
    case 2:
      System.out.println("today is Tuesday:");
     break;
    case 3:
      System.out.println("today is wednesday:");
     break;
    case 4:
      System.out.println("today is thusday:");
     break;
    case 5:
      System.out.println("today is Friday:");
    case 6:
      System.out.println("today is Saturday:");
     break;
    case 7:
      System.out.println("today is Sunday:");
     break;
    default:
      System.out.println("Invalid number:");

}

           
          
}
} 
