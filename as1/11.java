/10. Print number between 1 to 5 in word format
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           System.out.println("Only for one value ");
           System.out.println("*************************************");
           System.out.println("Enter the value");
           int a=sc.nextInt();
          switch(a%2)
          {
              case 0:
                  {
                      System.out.println("even");
                      break;
                  }
                  
              case 1:
                  {
                      System.out.println("odd");
                      break;
                  }
          }
       
   
}
}   
