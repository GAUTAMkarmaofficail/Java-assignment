/*3. WAP to enter an integer number and check it is prime or not*/
import java.util.Scanner;
class Operation{
private int a;

 public void setData(int a){
   this.a=a;

  }
  public void prime(){
int i;
 System.out.println("**************************");
   for( i=2;i<=a/2;i++)
    if(a%i==0)
       break;
    if(i>a/2)
System.out.println("prime");
else
System.out.println("not prime");
 System.out.println("**************************");
  }

 
}
class Main{
 public static void main(String args[]){
 Operation obj=new Operation();
 Scanner sc=new Scanner(System.in);
do{ 
 System.out.println("Press 1 for continue....  ");
 System.out.println("Press Any key for exit....");
 System.out.println("Please enter your choice  ");
        int choice = sc.nextInt();

 switch(choice){
   case 1:System.out.println("Enter 1 number");
        int n1=sc.nextInt();
 
        obj.setData(n1);
        obj.prime();
        break;                    
   default: System.exit(0); 
        }

      
    }while(true);
    

  }

}

