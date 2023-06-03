/*8. Modify the above question to allow student to sit if he/she has medical cause.
 Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print according
*/

import java.util.Scanner;
class Main{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
System.out.println(" ******************Ary you have madical (Y/N)*******************");
char ch =sc.next().charAt(0);
   System.out.println(" ******************Enter the total number of class held******************");
int h =sc.nextInt();
System.out.println(" ******************Enter the total number of class he attent******************");
int a =sc.nextInt();
System.out.println(" ******************total class =******************"+h);
System.out.println(" ******************total attent=******************"+a);
float cla=0,claa=0,total;


if(ch=='Y'){
               
              total=(a/100f)*h;
              if(total>=0)
              System.out.println("Eligible to seat in class:"+total);
              else
              System.out.println(" Not eligible to seat in class because of less percentage:"+total);
              }
else if(ch=='N')
{
             total=(a/100f)*h;
              if(total>=75)
              System.out.println("Eligible to seat in class:"+total);
              else
              System.out.println(" Not eligible to seat in class because of less percentage:"+total);

 }


}
}

