//7. WAP to find greater among three number
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           System.out.println("Only for two value ");
           System.out.println("*************************************");
           System.out.println("Enter the first value");
           int a=sc.nextInt();
           System.out.println("Enter the second value");
           int b=sc.nextInt();
           System.out.println("Enter the third value");
           int c=sc.nextInt();
               
    if (a>b && a>c){
           System.out.println("A is greater:"+a);
           }
    else if(b>c){
            System.out.println("B is greater:"+b);
           }
    else{
        System.out.println("c is greater"+c);
    }
}
}
  
