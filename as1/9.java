//9. WAP to check wheater number is positive or negative
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           System.out.println("Only for one value ");
           System.out.println("*************************************");
           System.out.println("Enter the first value");
           int a=sc.nextInt();
           
          
           
    String S=(a>0)?"positive":"negative";
    System.out.println("Your number is :"+S);
}
}
