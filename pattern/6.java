class Main{
    public static void main(String args[]){     
     
int i,j,k;
    
    for(i=9;i>=1;i--)
         {
             
         for(k=9;k>i;k--){
          System.out.print(" ");
           }
          for(j=9;j>=1;j--)
           {   
              
           

           if(i==1||(i==9)||(j==1)||j == 9)        
           System.out.print("*");  
          else
           System.out.print(" ");
          }
           
      System.out.println();
     }
    }


}
