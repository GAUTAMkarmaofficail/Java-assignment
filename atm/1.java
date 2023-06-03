//ATM PasswordField
import java.io.*;
import java.util.Scanner;
class Main{
    public static void main(String args[]){     
      Scanner sc=new Scanner(System.in);
      
     
      int b=10000,count=0;
char ch1;
do{

     do{
       Console console=System.console(); 
      char ch[]=console.readPassword("Enter the password: ");
      if(ch[0]=='1'&&ch[1]=='2'&&ch[2]=='3'&&ch[3]=='4')
      {
      count++;
      System.out.println("\t\t\t\t\t\t\t\tWEL-COME\n\t\t\t\t\t\t\t    Mr.Cheeku Singh"); 
      }
      else
      {
      System.out.println("Wrong pin");
      System.out.println("ENTER AGAIN YOUR FOUR DIGIT PIN");
      }

    }while(count==0);
count--;
      System.out.println("ENTER YOUR CHOICE");
      System.out.println("1 WITHDROWAL"); 
      System.out.println("2 BANLANCE ENQUIARY"); 
      System.out.println("3 FAST CASE");  
      int ch=sc.nextInt();
      if(ch==1)
       {
       System.out.println("SELECT YOUR ACCOUNT"); 
       System.out.println("1 CURRENT ACCOUNT"); 
       System.out.println("1 SAVING ACCOUNT");
       int sa=sc.nextInt(); 
       if(sa==1||sa==2)
    {
     System.out.println("ENTER THE AMOUNT YOU WANT TO WITHDRO"); 
      int am=sc.nextInt();
      
      
 
        if(am<=10000)
        {
         b=b-am;
         System.out.println("WITHDROWAL IS SUCCESSFULL\nTAKE YOUR CASE"); 
        } 
        else
        System.out.println("INSUFFICENT AMOUNT"); 
    }
}
if(ch==2)
     System.out.println("YOUR PRESENT BALNACE IS:"+b); 
if(ch==3)
{
   System.out.println("FAST CASE");
}
System.out.println("DO YOU WANT TO CONTINUE(Y/N)");
   ch1=sc.next().charAt(0);
   }while(ch1=='y'||ch1=='Y');
  }
}
