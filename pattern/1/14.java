/*14.

*
* 1 *
* 1 2 1 *
* 1 2 3 2 1 *
* 1 2 1 *
* 1 *
*
*/

  class Main{
    public static void main(String args[]){
    
    int i,j,k=1,l=0;
    System.out.println("*");
    for(i=1;i<4;i++)
      {  
        
            System.out.print("*");
            	
        for(j=1,k=1;k<=2*i-1;k++)
          {
             
             
              if(k<=i)
                 {
                   System.out.print(j);
                   j++;
               
           
             if(k==i)
              j=i;
           }
         else
           {
            --j;
            System.out.print(j);
           }
       } 
           System.out.print("*");
            System.out.println();
       }
       
     
    for(i=2;i>=1;i--)
      {  
        
            System.out.print("*");
        for(j=1,k=1;k<=2*i-1;k++)
          {
              
              if(k<=i)
                 {
                   System.out.print(j);
                   j++;
               
           
             if(k==i)
              j=i;
           }
         else
           {
            --j;
            System.out.print(j);
           }
       } 
           System.out.print("*");
            System.out.println();
       }   
         System.out.println("*");
       
    }
 }
