/*10.Write a program to check if a year is leap year or not.
If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400.
*/
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           System.out.println("Only for four variable ");
           System.out.println("*************************************");
           System.out.println("Enter the Year to check the leap");
           int y=sc.nextInt();
          
           if((y%400==0)||(y%4==0))
           {
               System.out.println("yes it is leap year :"+y);
           }
           else
           {
               
               System.out.println("No it is not a leap year :"+y);
           }
}
}   
