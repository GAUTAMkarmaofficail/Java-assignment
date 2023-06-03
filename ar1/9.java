/*9. Write a java program to search an element in given array

*/
import java.util.Scanner;
  class Main{
     public static void main(String args[]){


    int x[]={25,4,-6,-5,-6,0};
     Scanner ac = new Scanner(System.in);
       
         int i,c=0,e=0,o=0;
         int pos[]=new int[x.length];
         int ev[]=new int[x.length];
         int od[]=new int[x.length];
         for(i=0;i<x.length;i++){
            if(x[i]<0)
          {
           pos[c++]=i;
         
           
          }
         }
      if(c!=0)
        {
          System.out.print(" negative " +c+ "  time at index " );
          for(i=0;i<c;i++)
          System.out.print( " "+pos[i]);
          System.out.println("");
       }
   else
   {
   System.out.println("not found" );
   }
/******************/
     for(i=0;i<x.length;i++){
            if(x[i]>0&&x[i]%2==0)
          {
           ev[e++]=i;
         
           
          }
         }
      if(c!=0)
        {
          System.out.print(" even " +e+ "  time at index " );
          for(i=0;i<c;i++)
          System.out.print( " "+ev[i]);
          System.out.println("");
       }
   else
   {
   System.out.println("not found" );
   }
/*******************/
 for(i=0;i<x.length;i++){
            if(x[i]>0&&x[i]%2==1)
          {
           od[o++]=i;
         
           
          }
         }
      if(c!=0)
        {
          System.out.print(" odd " +o+ "  time at index " );
          for(i=0;i<c;i++)
          System.out.print( " "+ev[i]);
          System.out.println("");
       }
   else
   {
   System.out.println("not found" );
   }
  }
}
