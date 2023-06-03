/*1 WAP to program to calculate the factorial of any given number.

*/
import java.util.Scanner;
class Operation{
private int a;

 public void setData(int a){
   this.a=a;

  }
  public void fact(){
     int fact=1;
    for(int i=1;i<=a;i++)
    fact=fact*i;
 System.out.println("**************************");
    System.out.println("Fact is ="+fact+"\t\t *");
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
        obj.fact();
        break;                    
   default: System.exit(0); 
        }

      
    }while(true);
    

  }

}

