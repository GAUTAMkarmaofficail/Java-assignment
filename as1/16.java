/*16. W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit.
For given problem you have to take choice from user.
If user enter choice ‘c’ or ‘C’ then convert Fahrenheit to Celsius. 
If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit.
*/
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           System.out.println("Only for four variable ");
           System.out.println("*************************************");
           System.out.println("Enter the choice for converting");
           System.out.println("Enter 1 for Fahrenheit to Celsius");
           System.out.println("Enter 2 Celsius to Fahrenheit");
           int x=sc.nextInt();
           System.out.println("Enter value");
           float F=sc.nextFloat();
switch(x)
{
case 1:
float g= (F-32)/1.8f;
System.out.println("Fahrenheit to Celsius:"+g);
break;
case 2:
float d = F*(9/5f)+32;
System.out.println("Celsius to Fahrenheit:"+d);
break;
}
           
          
}
} 
