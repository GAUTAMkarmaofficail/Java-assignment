/*
V
*/
class Main{
  public static void main(String args[]){
          
       int i,j;
         
       
        for(i=1;i<=8;i++)
           { 
              for(j=1;j<=16;j++)
              
                 { 
              if(i==j||j == (16-i))
                 System.out.print("V");
             else
                 System.out.print(" ");        
               
              }
              System.out.println();
           }    
 }
   
}
