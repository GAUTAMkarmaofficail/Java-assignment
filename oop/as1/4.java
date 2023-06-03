/* 4.WAP to calculate x^y (x to the power y)*/
import java.util.Scanner;
class Operation{
private int a,b;

 public void setData(int a,int b){
   this.a=a;
   this.b=b;

  }
  public void power(){
int i,pow=1;
 System.out.println("**************************");
   for( i=1;i<=b;i++)
    pow=pow*a;
System.out.println("x^y: "+pow);

 System.out.println("**************************");
  }

 
}
class Main{
 public static void main(String args[]){
 Operation obj=new Operation();
 Scanner sc=new Scanner(System.in);
do{ 
 System.out.println("Press 1 for continue....Enter x^y number  ");
 System.out.println("Press Any key for exit....");
 System.out.println("Please enter your choice  ");
        int choice = sc.nextInt();

 switch(choice){
   case 1:System.out.println("Enter x number");
        int n1=sc.nextInt();
 
       
        System.out.println("Enter y number");
        int n2=sc.nextInt();
 
        obj.setData(n1,n2);
        obj.power();
        break;                    
   default: System.exit(0); 
        }

      
    }while(true);
    

  }

}

