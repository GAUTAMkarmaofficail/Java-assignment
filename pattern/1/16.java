/*
2
3  5
7  11  13
17  19  23  29
31  37  41  43  47
*/



     
       class Main{
    public static void main(String args[]){
    
    int i,k,j,n=2,pc=0; 
    
    for(i=1;i<=5;i++)
     
          {  
               pc=0;
             while(true)
               {  
                  k=2; 
                while(i<=(n/2)) 
                  {
                     if(n%k==0)
                        
                     break;
                         
                    k++;
                    
                 }
          	 
                  if(k>n/2) {
                      System.out.print(" "+n);     
                    
                   pc++;  }  
             
              n++;
               if(pc==i)
               
               break;
              
         }
           System.out.println(); 
       }
    }
 }
