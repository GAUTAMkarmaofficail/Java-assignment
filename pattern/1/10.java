/*10.
********1********
*******2*2*******
******3*3*3******
*****4*4*4*4*****
****5*5*5*5*5**** 
*/
class Main{
    public static void main(String args[]){     
     
int j,i,k;
    
    for(i=1;i<=5;i++)
     {
        for(k=1;k<=9-i;k++)
          System.out.print("*");
        
        for(j=1;j<=i;j++)
          System.out.print(i+"*");
        for(k=1;k<=7-i;k++)
          System.out.print("*");
          System.out.println();
       
     }
      
     
    
  }
}
