/*Q.16
Rearrange the array in alternating positive and negative items
Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
Note: Array should start with positive number.
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
        //k=a[0];
       for( i=0;i<a.length;i++){
               if(a[i]>0){ 
                 
                count[m]=a[i];
                m++;}
                 else{
                count[m]=a[i];
                 m++;}
               }
     for(i=0;i<m;i++)
          System.out.print(count[i]+", ");    

 } 
}
