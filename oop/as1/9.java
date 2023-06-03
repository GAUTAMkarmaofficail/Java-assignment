/*9. Calculate the sum of following serires
   1/x + 1/x^2 + 1/x^3......1/x^n 
*/
import java.util.Scanner;
class Operation{
private int a,b;

 public void setData(int a,int b){
   this.a=a;
   this.b=b;
 

  }
  public void power(){
  float i=1,sum=0,z1=1,z=1;
     while(i<=b)
   { 
 
   z=z*a;
   z1=1/z;
   sum=sum+z1;
   i++;
   }

     

System.out.println("series   1/x + 1/x^2 + 1/x^3......1/x^n : "+sum);

 System.out.println("**************************");
  }

 
}
class Main{
 public static void main(String args[]){
 Operation obj=new Operation();
 Scanner sc=new Scanner(System.in);
do{ 
 System.out.println("Press 1 for continue.... given series  1/x + 1/x^2 + 1/x^3......1/x^n ");
 System.out.println("Press Any key for exit....");
 System.out.println("Please enter your choice  ");
        int choice = sc.nextInt();

 switch(choice){
   case 1:
        System.out.println("Enter x number");
        int n1=sc.nextInt();
        System.out.println("Enter N time  number");
        int n2=sc.nextInt();
       
       
 
        obj.setData(n1,n2);
        obj.power();
        break;                    
   default: System.exit(0); 
        }

      
    }while(true);
    

  }

}

