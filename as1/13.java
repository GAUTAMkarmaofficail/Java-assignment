//13. Program to perform arithmetic operation using switch case
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           System.out.println("Only for numeric value ");
           System.out.println("*************************************");
           System.out.println("Enter the choice between (+ - * / %)");
            char operator=sc.next().charAt(0);;
           System.out.println("Enter First value");
           float a=sc.nextFloat();
           System.out.println("Enter Second value");
           float b=sc.nextFloat(); 
switch(operator)
{
case '+':
float c=a+b;
System.out.println("The sum:"+c);
break;
case '*':
 c=a*b;
System.out.println("The mul:"+c);
break;
case '-':
 c=a-b;
System.out.println("The sub:"+c);
break;
case '/':
c=a/b;
System.out.println("The divide:"+c);
break;
case '%':
c=a%b;
System.out.println("The modulator:"+c);
break;

}
           
          
}
} 
