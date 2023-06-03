/*8. WAP in C to display the n terms of harmonic series and
   their sum
   1 + 1/2 + 1/3 + 1/4 + 1/5 ... 1/n terms
*/
import java.util.Scanner;
class Operation{
private int a;

  public void power(){
float i;
                                             
float s=0;
 System.out.println("**************************");

   for(i=1;i<=a;i++) 
 {
    
  
    s=s+(1/i);

}

System.out.println("series  1 + 1/2 + 1/3 + ... 1/n : "+s);

 System.out.println("**************************");
  }

 
}
class Main{
 public static void main(String args[]){
 Operation obj=new Operation();
 Scanner sc=new Scanner(System.in);
do{ 
 System.out.println("Press 1 for continue.... given series 1 + 1/2 + 1/3 + 1/4 + 1/5 ... 1/n! ");
 System.out.println("Press Any key for exit....");
 System.out.println("Please enter your choice  ");
        int choice = sc.nextInt();

 switch(choice){
   case 1:System.out.println("Enter x number");
        int n1=sc.nextInt();
 
       
       
 
        obj.setData(n1);
        obj.power();
        break;                    
   default: System.exit(0); 
        }

      
    }while(true);
    

  }

}

