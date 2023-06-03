/*5 prime num*/

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter Matrix Row ");
   int row = sc.nextInt();
  System.out.println("Enter Matrix Column ");
   int col = sc.nextInt();
   
   int arr[][] = new int[row][col];
   
  int r,c,sum=0,d;
   for( r=0; r<arr.length; r++)
   {
    System.out.println("Enter "+arr[r].length+" element in "+r+" Row");

    for( c=0; c<arr[r].length; c++)
       arr[r][c]=sc.nextInt();
   }
  
   for( r=0; r<arr.length; r++)
     {for( c=0; c<arr[r].length; c++)
      { int i=2;
      if(arr[r][c]!=1){
    while(i<=arr[r][c]/2)
     {    if(arr[r][c]%i==0)
            break;
            i++;
     }
     if(i>arr[r][c]/2)
     sum+=arr[r][c];
    }
    }  
   }
     System.out.println("sum of prime number : "+sum);      
  }
}

