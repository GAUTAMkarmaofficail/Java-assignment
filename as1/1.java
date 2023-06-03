//1. WAP to calculate area of circle 
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius to calulate the area");
        float r=sc.nextFloat();
        float a=3.14f*r*r;
        System.out.println("the area of Circle is :"+a);
    }
    
}
