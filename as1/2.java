//2. WAP to calculate area of rectangle 
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           System.out.println("Enter the length to calulate the area of rectangle");
          float L=sc.nextFloat();
           System.out.println("Enter the breath to calulate the area of rectangle");
          float B=sc.nextFloat();
          float a=L*B;
           System.out.println("the area of rectangle is :"+a);
    }
    
}
