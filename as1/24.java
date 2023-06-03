//24. Write a Java program to count total number of notes in given amount
import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
int n2000,n500,n200,n100,n50,n20,n10,n5,n2,n1;
    System.out.println(" enter the amount");
     int amount=sc.nextInt();
    System.out.println("***************************************");
    n2000=amount/2000;
    
    amount=amount%2000;
    n500=amount/500;
    amount=amount%500;
    
    n200=amount/200;
     amount=amount%200;
     
     n100=amount/100;
     amount=amount%100;
      
    n50=amount/50;
    amount=amount%50;
    
    n20=amount/20;
   amount=amount%20;
    
    n10=amount/10; 
    amount=amount%10; 
    
    n5=amount/5;
    amount=amount%5;
    
    n2=amount/2;
    amount=amount%2;
    
   n1=amount/1;
    amount=amount%1;
   
    System.out.println("Note is:"+n2000);
    System.out.println("Note is:"+n500);
    System.out.println("Note is:"+n200);
    System.out.println("Note is:"+n100);
    System.out.println("Note is:"+n50);
    System.out.println("Note is:"+n20);
    System.out.println("Note is:"+n10);
    System.out.println("Note is:"+n5);
    System.out.println("Note is:"+n2);
    System.out.println("Note is:"+n1);
    
    }
  
    
    
	
}


