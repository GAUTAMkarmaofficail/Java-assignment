/*
K

*/
class Main{
    public static void main(String args[]){     
     
int i,j;
    
    for(i=1;i<=4;i++){
         for(j=1;j<=5;j++)
          {         
            if( j==1   || j == (6-i))
             System.out.print("K");
            else
             System.out.print(" ");
          }
      System.out.println();
    }
for(i=1;i<=5;i++){
         for(j=1;j<=7;j++)
          {         
            if( j==1   || i==j )
             System.out.print("K");
            else
             System.out.print(" ");
          }
      System.out.println();
    }

}
}

