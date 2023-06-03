// 14. WAP to find lowest number among four different number
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           System.out.println("Only for four variable ");
           System.out.println("*************************************");
           System.out.println("Enter the value");
          int a=sc.nextInt();
          int b=sc.nextInt();
          int c=sc.nextInt();
          int d=sc.nextInt();
          int x,y,z;
          x=(a<b)?a:b;
          y=(c<d)?c:d;
          z=(x<y)?x:y;
          System.out.println("smallest amoung:"+z);
}
}   
    
