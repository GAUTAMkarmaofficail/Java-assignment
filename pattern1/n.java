/*
N
*/
class Main{
  public static void main(String args[]){
          
       int i,j;
         
       
        for(i=1;i<=7;i++)
           { 
              for(j=1;j<=7;j++)
              
                 { 
              if(j==1||j==7||i==j)
                 System.out.print("N");
             else
                 System.out.print(" ");        
               
              }
              System.out.println();
           }    
 }
   
}
