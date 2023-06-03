/*12.WAP to to input 3 digit number and check it is armstron or not*/

import java.util.Scanner;
class Operation{
private int a;

 public void setData(int a){
   this.a=a;
 

  }
  public void power(){
int i;
                                             
int sum=0,sum1=0,sum2=0;
 System.out.println("**************************");

   for(i=1;i<=a;i++) 
 {
    if(i%2==1)
      sum1=sum1+i;
    else
      sum2=sum2+i;
  

}
sum=sum1-sum2;
System.out.println("series 1 - 2 + 3 - 4 + 5 - 6................n terms : "+sum);

 System.out.println("**************************");
  }

 
}
class Main{
 public static void main(String args[]){
 Operation obj=new Operation();
 Scanner sc=new Scanner(System.in);
do{ 
 System.out.println("Press 1 for continue.... given series 1 - 2 + 3 - 4 + 5 - 6................n terms ");
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

