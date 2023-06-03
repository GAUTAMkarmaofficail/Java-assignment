import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
 System.out.println("Enter the value even value");
           int n=sc.nextInt();  
 int i,j,col=0;  
     if(n%2==1)
      col=n/2+1;
     else
      col=n/2;

  


   
    
      for(i=1;i<=n;i++)
     {
         for(j=1;j<=col;j++)
           if(j>=i||i+j>n)
         System.out.print("*");
         else
         System.out.print(" ");
          
        
     System.out.println();
  }  
    


  }

}
