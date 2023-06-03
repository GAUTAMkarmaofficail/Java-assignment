/*Q.12
Find common elements in three sorted arrays.
Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?
*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
     int i,j,k,m;
 /******************************************/ 
  System.out.println("Enter array 1 length");
   int n = sc.nextInt();
   
     int a[]= new int[n];
    
     int count[]= new int[a.length];
     m=0;    
     for( i=0;i<n;i++)
	  {
	    System.out.println("Enter element of ar 1  Value");
	    a[i]=sc.nextInt();
	  }
System.out.println("Enter array 2 length");
   int n2 = sc.nextInt();
   
     int b[]= new int[n2];
     
     for( i=0;i<n2;i++)
	  {
	    System.out.println("Enter element of ar 2 Value");
	    b[i]=sc.nextInt();
	  }
System.out.println("Enter array 3 length");
   int n3= sc.nextInt();
   
     int c[]= new int[n3];
     
     for( i=0;i<n3;i++)
	  {
	    System.out.println("Enter element of ar 3 Value");
	    c[i]=sc.nextInt();
	  }
/******************************************************/	 
	 for(  i=0;i<n; i++)
	    { for(  j=0;j<n2; j++)
                 for(  k=0;k<n3; k++)
                 {
                        if((a[i]==b[j])&&(c[k]==a[i]))
                          {
                            
                            count[m]=a[i];
                            m++;
                            }


                 }
} 
          System.out.print("intersaction or common element is :");
          for(i=0;i<m;i++)
          System.out.print(count[i]+", ");

  


    }
  
}
