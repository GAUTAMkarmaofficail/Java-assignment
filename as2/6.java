/*6.Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1
*/
import java.util.Scanner;
class Main{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
   System.out.println(" ******************Enter the  numberto convert******************");
int a =sc.nextInt();
int result;
if(a>=0)
{
 
 System.out.println(a);
}
else if(a<=0)
{
result=(a-(a*2));
 System.out.println(""+result);
}
else
System.out.println("Zero");
 

}
}
