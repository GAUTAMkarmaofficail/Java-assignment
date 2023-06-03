/*
B
*/
class Main{
  public static void main(String args[]){
          
       int i,j;
         
       
        for(i=1;i<=5;i++)
           { 
              for(j=1;j<=4;j++)
              {
                  if((i==2 && j==2) || (i==2 && j==3)|| (i==4 && j==2) || (i==4 && j==3))
                System.out.print(" ");
              
                if((j==1 || j==4 )|| (j==4 && i==2) ||( j==4 && i==4) )
                System.out.print("B ");
                
               
              }
              System.out.println();
           }    
        }
    }
