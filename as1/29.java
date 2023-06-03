/*29. Write a program to input choice from user. 
If user enter ‘+’ as choice then calculate addition of 2 number. If Choice ‘>’ then check which number is greaterst. 
If choice is ‘==’ then check both number is equal or not.
*/import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           System.out.println("Only for numeric value ");
           System.out.println("*************************************");
           System.out.println("Enter the choice between (+,=,*,<,>)");
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
case '>':
 boolean e=a>b;
System.out.println("The  A is greater:");
break;
case '<':
 e=a<b;
System.out.println("The  A is less:");
break;
case '=':
if(a==b)
System.out.println("It is  equal:");
else
System.out.println("It is not equal:");
break;

}
           
          
}
} 
