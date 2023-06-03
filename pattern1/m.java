/*
M
*/
class Main{
  public static void main(String args[]){
          
       int i,j;
         
       
        for(i=1;i<=5;i++)
           { 
              for(j=1;j<=5;j++)
              {
      
              
                if( j==1 || j==5 || (j==2 && i==2) || (j==3 && i==3) || (j==4 && i==2))
                System.out.print("M ");
                
                
                else
                System.out.print("  ");
               
              }
              System.out.println();
           }    
        }
}
