/*11. Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.
if employee is a male and age is in between 20 to 40 then he may work in anywhere
if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
And any other input of age should print "ERROR".
*/
import java.util.Scanner;
class Main{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
System.out.println("Enter the age of person");
int a =sc.nextInt();
System.out.println("Enter your gender given below");
System.out.println("F: for Female\nM: for male\n ");

char g =sc.next().charAt(0);
System.out.println("Enter your marital status ( Y or N ) given below");
System.out.println("Yes: for yes\nNo: for no\n ");
char ma =sc.next().charAt(0);
System.out.println("**********************your marital status is:"+ma);

if(g=='F')
System.out.println(" she will work only in urban areas");
else if(g=='M'&&(a>=20&&a<=40))
System.out.println(" he may work in anywhere");
else if(g=='M'&&(a>40&&a<=60))
System.out.println("  he will work in urban areas only.");
else
System.out.println("ERROR");

}
}
