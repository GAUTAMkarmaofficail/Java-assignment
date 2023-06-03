class Main{
    public static void main(String args[]){     
     
int i,j,k;
    
    for(i=1;i<=7;i++)
         {
             
         for(k=7;k>i;k--)
          System.out.print(" ");
         
         for(j=1;j<=7;j++)
            
           if(i==1||(i==7)||(j==1)||j == 7)        
           System.out.print("*");  
          else
           System.out.print(" ");

           
         System.out.println();
      }
    }
}
