/*34. Write a java program to implement linear search*/
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






    int temp=0,item=9;
    for(i=0; i<x.length; i++)
    {


        if(x[i]==item)
        {
            System.out.print("item  "+x[i]+" present at "+i+" index position");
            temp=temp+1;
        }






    }

    if(temp==0)
       System.out.print("itemnot found ");

}
}
