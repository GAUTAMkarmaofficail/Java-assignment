/*8.

A
ABA
ABCBA
ABCDCBA
ABCDEDCBA 
*/
class Main{
    public static void main(String args[]){
        
   int i,j,k;

   for(i=65;i<=69;i++)
  {
    
    for(k=65;k<i;k++)
 
    System.out.print((char)k);
      for(j=i;j>=65;j--)
 
    System.out.print((char)j);
   
  System.out.println();


  }
 }
}
