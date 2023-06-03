import java.util.Scanner;
  class Main{
     public static void main(String args[]){
        Scanner ac = new Scanner(System.in);
        System.out.println("Enter range of Array");
        int n= ac.nextInt();
        int a[]=new int[n];
       
  
        int i,n=0,j=0;
        for(i=0;i<=a.length-1;i++){
            System.out.println("Enter " +i+ "  element");
            a[i] = ac.nextInt();
         }
         System.out.println("Enter Element for Search");
         int ele = ac.nextInt();
         for(i=0;i<=a.length-1;i++){
            if(ele == a[i]){
            k[i]=a[i];
           j++;
           
          }
          }
           if(j>0){
            System.out.print("Element found  ");
           
           
           System.out.print(j +" times at index ");
           }
        for(i=0;i<=n-1;i++){
        if(ele==k[i])
        System.out.print( i+ "  ");
          } 
}}
