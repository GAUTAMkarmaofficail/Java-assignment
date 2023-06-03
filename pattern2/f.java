/*f*/
class Main{
  public static void main(String args[]){
          
       int i,j;
         
       
        for(i=1;i<=9;i++)
           { 
              for(j=1;j<=8;j++)
              {
      
              
                if((j==4 && i>1) || i==5 || (i==1 && (j>4 || j>=8))){
                System.out.print("f");
                }
               
               else
               System.out.print(" ");
               
              }
              System.out.println();
           }    
        }
    }
