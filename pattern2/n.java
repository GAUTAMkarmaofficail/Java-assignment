/*
n
*/
class Main{
  public static void main(String args[]){
          
       int i,j;
         
       
        for(i=2;i<=8;i++)
           { 
              for(j=1;j<=6;j++)
              
                 { 
              if((i==4&&(j>0&&j<=5))||(j==1&&(i>=3&&i<=8))||(j==6&&(i>=5&&i<=8)))
                 System.out.print(" n");
              else
                 System.out.print("  ");
             }
               
              
              System.out.println();
           }    
        }
    }
