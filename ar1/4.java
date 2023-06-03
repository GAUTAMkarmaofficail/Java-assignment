/*4. Write a java program to reverse the array


*/
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
   int j,i;
   //System.out.println("Enter Total no of Element");
     //int n=sc.nextInt();
     //int  x[] = new int[n];
      
      
      int x[]={5,8,3,10,7};

       for( i=0,j=x.length-1; i<j; i++,j--)
         {  
            int temp;
            temp=x[i];
            x[j]=temp;
          }    

for(int ele:x)
 System.out.println(ele);

  }
 }
