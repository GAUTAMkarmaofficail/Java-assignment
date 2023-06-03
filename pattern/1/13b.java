class Main{
    public static void main(String args[]){     
     
int j,n=0,i;
    
    for(i=1;i<=4;i++)
     {

       
        
         for(j=1;j<=2*i-1;j++)
        
               { 
               if(j%2==0) 
               System.out.print("*");
                 else{
              n++;
             System.out.print(n);
               }
            
               
                }
            System.out.println();
       
       }

      for(i=4;i>=1;i--)
     {

       
        
         for(j=1;j<=2*i-1;j++)
        
               { 
               if(j%2==0) 
               System.out.print("*");
                 else{
             
             System.out.print(j);
             
         
               }
            
             }  
                
            System.out.println();
       
       
       
       
       }
  }
}
