/*class Main{
    public static void main(String args[]){     
     
     
int i,j;
    
    for(i=1;i<=10;i++){
         for(j=1;j<=10;j++)
          {         
            if( j==1 || i == 10  || i==j )
             System.out.print("*");
            else
             System.out.print(" ");
          }
      System.out.println();
    }
  }
}
*/
class Main{
    public static void main(String args[]){     
     
int i,j;
    
    for(i=1;i<=11;i++){
         for(j=1;j<=19;j++)
          {         
            if( i == 10 || j == (11-i)|| i==j-9)
             System.out.print("*");
            else
             System.out.print(" ");
          }
      System.out.println();
    }

}
}
