/*
X
*/
class Main{
    public static void main(String args[]){     
     
int i,j;
    
    for(i=1;i<=9;i++){
         for(j=1;j<=9;j++)
          {         
            if( i==j || j == (10-i))
             System.out.print("X");
            else
             System.out.print(" ");
          }
      System.out.println();
    }

}
}

