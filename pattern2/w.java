/*
w
*/
class Main{
  public static void main(String args[]){
          
       int i,j;
         
       
        for(i=1;i<=5;i++)
           { 
              for(j=1;j<=5;j++)
              {
      
              
                if( j==1 || j==5 || (j==2 && i==4) || (j==3 && i==3) || (j==4 && i==4))
                System.out.print("w ");
                
                
                else
                System.out.print("  ");
               
              }
              System.out.println();
           }    
        }
}
