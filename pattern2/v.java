/*
v
*/
class Main{
  public static void main(String args[]){
          
       int i,j;
         
       
        for(i=1;i<=6;i++)
           { 
              for(j=1;j<=12;j++)
              
                 { 
              if(i==j||j == (12-i))
                 System.out.print("v");
             else
                 System.out.print(" ");        
               
              }
              System.out.println();
           }    
 }
   
}
