/*7. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
*/
import java.util.Scanner;
class Main{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
   System.out.println(" ******************Enter the total number of class held******************");
int h =sc.nextInt();
System.out.println(" ******************Enter the total number of class he attent******************");
int a =sc.nextInt();
System.out.println(" ******************total class =******************"+h);
System.out.println(" ******************total attent=******************"+a);
float cla=0,claa=0,total;

total=(a/100f)*h;

if(total>=75)
System.out.println("Eligible to seat in class:"+total);
else
System.out.println(" Not eligible to seat in class because of less percentage:"+total);
 }

}
