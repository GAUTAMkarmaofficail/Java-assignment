/*27. Write a Java program to input basic salary of an employee and calculate its Gross salary according to following: 
Basic Salary <= 10000 : HRA = 20%, DA = 80% 
Basic Salary <= 20000 : HRA = 25%, DA = 90% 
Basic Salary > 20000 : HRA = 30%, DA = 95% 
*/
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           System.out.println("Only for numeric value ");
           System.out.println("*************************************");
           System.out.println("Enter the salary of employee");
              int a=sc.nextInt();
float HRA,DA,GS=0;
if(a<10001)
{
 HRA=((a/100f)*20);
 DA=((a/100f)*80);
GS=HRA+DA+a;
}
else if(a<=20000)
{
 HRA=((a/100f)*25);
 DA=((a/100f)*90);
GS=HRA+DA+a;
}
else if (a>20000)
{
 HRA=((a/100f)*30);
 DA=((a/100f)*95);
GS=HRA+DA+a;
}


System.out.println("Your  Gross salary is: "+GS);
  }
}
