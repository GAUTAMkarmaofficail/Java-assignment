//9. Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).import java.util.Scanner;
import java.util.Scanner;
class Main{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
System.out.println(" ******************Enter the charater to check it is Alphabat or not*******************");
char ch =sc.next().charAt(0);
if(ch>='a'&&ch<='z')
System.out.println(" ******************It is lower case *******************");
else if(ch>='A'&&ch<='Z')
System.out.println(" ******************It is upper case*******************");
else
System.out.println(" ******************Invalid*******************");


}
}
