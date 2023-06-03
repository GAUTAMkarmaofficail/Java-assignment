/*1 WAP to program to calculate the reverse of any given number.
*/
import java.util.Scanner;
class Operation{
private int a;

 public void setData(int a){
   this.a=a;

  }
  public void rev(){
     int r=0,s=0;
   while(a!=0){
   r=a%10;
   s=s*10+r;
   a=a/10;

}
 System.out.println("**************************");
    System.out.println("Rev is ="+s+"\t\t *");
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
        obj.rev();
        break;                    
   default: System.exit(0); 
        }

      
    }while(true);
    

  }

}

