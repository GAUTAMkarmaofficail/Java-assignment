//23. Write a Java program to input day number and print week day.
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           System.out.println("Only for numeric value ");
           System.out.println("*************************************");          
           System.out.println("Enter day number between(1-7)");
           int a=sc.nextInt();
          
switch(a)
{
case 1:
System.out.println("today is Sunday:");
break;
case 2:
System.out.println("today is Monday:");
break;
case 3:
System.out.println("today is Tuesday:"); 
break;
case 4:
System.out.println("today is Wednesday:");
break;
case 5:
System.out.println("today is thusday:");
case 6:
System.out.println("today is Friday:");
break;
case 7:
System.out.println("today is Saturday:");
break;
default:
System.out.println("Invalid number:");

}

           
          
}
} 
