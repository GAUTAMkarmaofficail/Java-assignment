/*3.

      1
      1 2
      1     3
      1        4
      1 2 3  4  5
*/
class Main{
    public static void main(String args[]){     
     
     
int i,j;
    
    for(i=1;i<=5;i++){
         for(j=1;j<=i;j++)
          {         
            if( j==1 || i == 5  || i==j )
             System.out.print(" "+j);// it give space only
            else
             System.out.print("  ");
          }
      System.out.println();
    }
  }
}
