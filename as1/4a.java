//4.1. WAP to exchange value to two variable with third variable 
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           System.out.println("Swaping of two variable ");
           System.out.println("*************************************");
           System.out.println("Enter the first value");
           int a=sc.nextInt();
           System.out.println("Enter the second value");
                int b=sc.nextInt();
                int swap;
                        
                swap=a;
                a=b;
                b=swap;
                       
              
           System.out.println("Your swap  is :"+a);
           System.out.println("Your swap  is :"+b);
    }
    
}
