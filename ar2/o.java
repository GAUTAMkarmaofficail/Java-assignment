//Q.5 Find occurance of an integer number in array.

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter arrey length");
   int n = sc.nextInt();
   int arr[]= new int[n];
  for(int i=0;i<n;i++)
  {
    System.out.println("Enter Value :");
    arr[i]=sc.nextInt();
  }
  int i;
   for(i=0; i<arr.length; i++)
    {   int count=0;
    for(int j=i; j<arr.length; j++)
   {    
        if(arr[i]==arr[j])
         { 
        count++;
        
         }
   
        
    }   
        System.out.println("Occurance of "+arr[i]+" is "+count);
        if(count>1)
         break;     
   }
  }
}
