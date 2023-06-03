/*
a
*/
class Main{
  public static void main(String args[]){
          
       int i,j;
         
       
        for(i=1;i<=7;i++)
           { 
              for(j=1;j<=7;j++)
              
                 { 
              if((i==1&&(j>0&&j<7))||(i==4&&(j>1&&j<=7))||(i==7&&(j>1&&j<=6))||(j==7&&(i>1&&i<=6))||(j==1&&(i>4&&i<7)))
                 System.out.print("a");
             else
                 System.out.print(" ");        }
               
              
              System.out.println();
           }    
        }
    }
