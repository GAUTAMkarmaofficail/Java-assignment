//5.Take input of age of 3 people by user and determine oldest and youngest among them.
import java.util.Scanner;
class Main{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
   System.out.println(" ******************Enter the  age of three person*******************");
int a =sc.nextInt();
int b =sc.nextInt();
int c =sc.nextInt();

if(a>b&&a>c)
{
 System.out.println("**********************oldest"+a);
}
else if(b>c&&b>a)
{
 System.out.println("**********************oldest "+b);
}
else
{
System.out.println("**********************oldest "+c);
}
if(a<b&&a<c)
{
 System.out.println("**********************Young"+a);
}
else if(b<c&&b<a)
{
 System.out.println("**********************Young"+b);
}
else
{
System.out.println("**********************Young"+c);
}

}
}
