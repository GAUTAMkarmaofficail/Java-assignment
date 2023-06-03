/*
e
*/
class Main{
  public static void main(String args[]){
          
       int i,j;
         
       
        for(i=1;i<=7;i++)
           { 
              for(j=1;j<=6;j++)
              
                 { 
              if((i==1&&(j>1&&j<6))||i==4||(i==7&&(j>1&&j<=6))||(j==1&&(i>1&&i<7))||(j==6&&(i>=2&&i<=3)))
                 System.out.print("e ");
             else
                 System.out.print("  ");             
                 }
               
              
              System.out.println();
           }    
        }
    }
