/*3.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount
*/
import java.util.Scanner;
class Main{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
   System.out.println(" Enter the year of work");
int year =sc.nextInt();

System.out.println(" Enter the salary");
   int salary =sc.nextInt();
float bonus,total;
  
if(year>=5)
{
total=(salary/100)*5;
bonus=total+salary;
}
else
{
bonus=salary;
}
 System.out.println(" total salary is :"+bonus);
}
}
