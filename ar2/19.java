/*Q.19) Find Maximum product contigeous sub array 

*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
     int i,j,k=1,m;
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
              // if((a[i]>0||a[i]<0)&&(a[i]==0))
                // k=k*a[i];
               if(a[i]==0)
                 break;
              else
                k=k*a[i];
               } 
              
    // for(i=0;i<m;i++)

              System.out.print(k+" "); 

}
}
