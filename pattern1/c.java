/*
     C
*/
class Main{
    public static void main(String args[]){     
     
int i,j;
    
    for(i=1;i<=5;i++){
         for(j=1;j<=6;j++)
          {         
            if((i==3&&j==1)||(i==1&&j>2)||(i==5&&j>2)||((i==2||i==4)&&j==2))
             System.out.print("C");
            else
             System.out.print(" ");
          }
      System.out.println();
    }

}
}
