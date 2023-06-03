/*37. Write a java progrtam to implement insertion sort algorithm */
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
     int i,j,sum=0;
  
  System.out.println("Enter array length");
   int n = sc.nextInt();
   
     int x[]= new int[n];
     
     for( i=0;i<n;i++)
	  {
	    System.out.println("Enter element Value");
	    x[i]=sc.nextInt();
	  }
	 
     int temp;
      for( i=1;i<x.length;i++)
      {
   temp=x[i];
     j=i;
   while(j>0&&x[j-1]>temp)
    {
    x[j]=x[j-1];
j=j-1;

}
x[j]=temp;
}

for( i=0;i<x.length;i++)
   System.out.print(" "+x[i]);
    
}
}
