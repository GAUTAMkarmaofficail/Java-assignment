/*28. Write a C program to input electricity unit charges and calculate total electricity bill according to the given condition: 
For first 50 units Rs. 0.50/unit 
For next 100 units Rs. 0.75/unit 
For next 200 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit 
An additional surcharge of 20% is added to the bill.
*/
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           System.out.println("Only for numeric value ");
           System.out.println("*************************************");
           System.out.println("Enter the Unit of electric meter");
              int a=sc.nextInt();
float x,y,z=0;
if(a<=50)
{
 x=a*0.50f;
 y=(x/100)*20;
 z=x+y;
}
if(a>50&&a<=100)
{
x=a*0.75f;
y=(x/100)*20;
z=x+y;
}
if(a>100&&a<=150)
{
x=a*1.20f;
y=(x/100)*20;
z=x+y;
}
if(a>150&&a<=250)
{
x=a*1.50f;
y=(x/100)*20;
z=x+y;
}
System.out.println("Your electric Bill is"+z);
  }
}
