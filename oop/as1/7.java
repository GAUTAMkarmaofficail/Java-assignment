/*7 WAP to calculate the sum of series 1/1! + 2/2! + 3/3!.......n\n! 
   
*/


import java.util.Scanner;
class Operation{
private int a;

 public void setData(int a){
   this.a=a;
 

  }
  public void power(){
int i,fact=1;
float p=0f,sum=0f;
 System.out.println("**************************");

   for(i=1;i<=a;i++) 
 {
    fact=fact*i;
    p=i/fact;
    sum=sum+p;
}
        
     

System.out.println("series 1/1! + 2/2! + 3/3!.......n! : "+sum);

 System.out.println("**************************");
  }

 
}
class Main{
 public static void main(String args[]){
 Operation obj=new Operation();
 Scanner sc=new Scanner(System.in);
do{ 
 System.out.println("Press 1 for continue.... given series 1/1! + 2/2! + 3/3!.......n\n! ");
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

