/*s*/

class Main{
    public static void main(String args[]){     
     
int i,j;
    
    for(i=1;i<=5;i++){
         for(j=1;j<=10;j++)
          {         
            if((i==3&&j==1)||(i==1&&(j>2 && j<=5) ) ||(i==5&&(j>2 && j<=5))||((i==2||i==4)&&j==2) )
             System.out.print("s ");
            else
             System.out.print(" ");
          }
      System.out.println();
    }

     for(i=2;i<=5;i++){
         for(j=1;j<=10;j++)
          {         
            if( (i==5&&(j>2 && j<=5)) || (i==2 && j==8) || (i==3 && j==9) || (i==4 && j==8) )
             System.out.print("s ");
            else
             System.out.print(" ");
          }
      System.out.println();
    }


}
}
