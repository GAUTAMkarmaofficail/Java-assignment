/*
d
*/
class Main{
  public static void main(String args[]){
          
       int i,j;
         
       
        for(i=1;i<=7;i++)
           { 
              for(j=1;j<=7;j++)
              
                 { 
              if((i==4&&(j>1&&j<=7))||(i==7&&(j>1&&j<=7))||j==7||(j==1&&(i>=5&&i<=6)))
                 System.out.print("d");
              else
                System.out.print(" ");
             }
               
              
              System.out.println();
           }    
        }
    }
