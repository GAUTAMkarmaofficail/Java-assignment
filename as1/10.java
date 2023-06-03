//10. Print number between 1 to 5 in word format
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           System.out.println("Only for one value ");
           System.out.println("*************************************");
           System.out.println("Enter the value");
           int a=sc.nextInt();
           
          if(a==1){
              System.out.println("one");
              
          }
   else if(a==2){
        System.out.println("two");
       
   }
   else if(a==3){
        System.out.println("three");
       
   }
   else if(a==4){
        System.out.println("Four");
   }
   else {
        System.out.println("Five");
       
   }
}
}   
