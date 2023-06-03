/*13.Find the first repeating element in array of integers*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
     int i,temp,j,k=0;
 /******************************************/ 
  System.out.println("Enter array 1 length");
   int n = sc.nextInt();
   
     int a[]= new int[n];
     

    
     //int count[]= new int[a.length];
     //m=0;    
     for( i=0;i<n;i++)
	  {
	    System.out.println("Enter element of ar 1  Value");
	    a[i]=sc.nextInt();
	  }

            //temp=a[0];
         for( i=1;i<n;i++)
             { for( j=1;j<n;j++)
            if(a[i]==a[j])
            {
              k=a[i];
                break;
             }
          break;
             }
  System.out.println("the  element is "+a[i]+" repeacted for first time");


  }
}
