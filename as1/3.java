//3. WAP to calculate the percentage of students 
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("only for Five Subject");
        System.out.println("*************************************");
           System.out.println("Enter the marks of subject 1");
          int a=sc.nextInt();
           System.out.println("Enter the mark of subject 2");
        int b=sc.nextInt();
          System.out.println("Enter the mark of subject 3");
            int c=sc.nextInt();
                System.out.println("Enter the mark of subject 4");
                  int d=sc.nextInt();
                      System.out.println("Enter the mark of subject 5");
                        int e=sc.nextInt();
                        int total=(a+b+c+d+e);
                        float result=total/5;
                        System.out.println("Your total mark is :"+total);
           System.out.println("Your percentage is :"+result);
    }
    
}
    
    
    
    
    
    
    
