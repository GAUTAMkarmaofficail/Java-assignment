/*
b
*/
class Main{
  public static void main(String args[]){
          
       int i,j;
         
       
        for(i=1;i<=7;i++)
           { 
              for(j=1;j<=6;j++)
              
                 { 
              if((i==7&&(j>0&&j<=5))||(i==4&&(j>0&&j<=5))||j==1||(j==6&&(i>=5&&i<=6)))
                 System.out.print("b");
              else
                 System.out.print(" ");
             }
               
              
              System.out.println();
           }    
        }
    }
