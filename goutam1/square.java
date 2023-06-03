import java.util.Scanner;
class Main{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
System.out.print(" \nEnter the choice\n 1 for square \n 2 for cube \n ");
int z =sc.nextInt();
System.out.println(" Enter the value ");
int x =sc.nextInt();

int result;

  switch(z)
 {
case 1:
  {
System.out.println(" The  given number is "+x);
result=x*x;
System.out.println(" The square of given number is "+result);
break;
  }
case 2:
  {
System.out.println(" The  given number is "+x);

result=x*x*x;
System.out.println(" The cube of given number is "+result);
break;
  }

}
}
}




