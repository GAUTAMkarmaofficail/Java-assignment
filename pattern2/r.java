/*r*/
class Main{
  public static void main(String args[]){
          
       int i,j;
         
       
        for(i=1;i<=9;i++)
           { 
              for(j=1;j<=8;j++)
              {
      
              
                if((j==8&&(i>1&&i<3))||(j==4 && i>1)  || (i==1 && (j>4 || j>=7))||(i==1&&j==3))
                System.out.print("r");
                
               
               else
               System.out.print(" ");
               
              }
              System.out.println();
           }    
        }
    }
