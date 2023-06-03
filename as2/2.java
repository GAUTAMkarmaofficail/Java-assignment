/*2.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.

Judge and print total cost for user
*/
import java.util.Scanner;
class Main{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
   System.out.println(" Enter the unit of things ");
   int unit =sc.nextInt();
float tot,total,dis=0;
  
if(unit>=10)
{
tot=(unit*100);
dis=(tot/100f)*10;
total=tot-dis;
}
else
{
total=unit*100;
}
 System.out.println(" total discount is :"+dis);
 System.out.println(" total cost is :"+total);
}
}
