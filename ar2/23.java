/*23. Write a Java program to find the sum and average of one dimensional integer array.*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
     int i,j,k=1;
        float m;
 /******************************************/ 
  System.out.println("Enter array 1 length");
   int n = sc.nextInt();
   
     int a[]= new int[n];
    
     //int count[]= new int[a.length];
    m=0;    
     for( i=0;i<n;i++)
	  {
	    System.out.println("Enter element of ar 1  Value");
	    a[i]=sc.nextInt();
	  }
        //k=a[0];
       for( i=0;i<a.length;i++) 
              {
               k=k+a[i];
               m=k/n;
               } 
              
    // for(i=0;i<m;i++)
               System.out.println("sum "+k+" "); 
              System.out.println("Ave "+m+" "); 

}
}
