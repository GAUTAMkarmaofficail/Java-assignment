/*
     A
*/
class Main{
    public static void main(String args[]){     
     
int i,j;
    
    for(i=1;i<=11;i++){
         for(j=1;j<=19;j++)
          {         
            if( ((i == 6)&&(j>4&&j<16)) || j == (11-i)|| i==j-9)
             System.out.print("A");
            else
             System.out.print(" ");
          }
      System.out.println();
    }

}
}
