// 15. WAP to check given year is a leap year or no
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           System.out.println("Only for four variable ");
           System.out.println("*************************************");
           System.out.println("Enter the Year to check the leap");
           int y=sc.nextInt();
          
           if((y%400==0)||(y%100==0)||(y%4==0))
           {
               System.out.println("yes it is leap year :"+y);
           }
           else
           {
               
               System.out.println("No it is not a leap year :"+y);
           }
}
}   
    
