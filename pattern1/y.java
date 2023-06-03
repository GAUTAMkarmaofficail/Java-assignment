
/*
Y
*/
class Main{
  public static void main(String args[]){
          
       int i,j;
         
       
        for(i=1;i<=7;i++)
           { 
              for(j=1;j<=7;j++)
              
                 { 
               if((i==j&&i<4)||(j==4&&(i>3&&i<8))||((j==8-i)&&(i<4)))
                 System.out.print("Z");
             else
                 System.out.print(" ");        }
               
              
              System.out.println();
           }    
        }
    }
