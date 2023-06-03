
/*
o
*/
class Main{
    public static void main(String args[]){     
     
int i,j;
    
    for(i=1;i<=5;i++){
         for(j=1;j<=10;j++)
          {         
            if((i==3&&j==1)||(i==1&&(j>2 && j<=5) ) ||(i==5&&(j>2 && j<=5))||((i==2||i==4)&&j==2) || (i==2 && j==7) || (i==3 && j==8) || (i==4 && j==7) )
             System.out.print("o ");
            else
             System.out.print(" ");
          }
      System.out.println();
    

           }    
        }
    }
