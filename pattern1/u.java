/*
U
*/
class Main{
  public static void main(String args[]){
          
       int i,j;
         
       
        for(i=1;i<=10;i++)
           { 
              for(j=1;j<=8;j++)
              {
      
              
                if( (j==1 && i<=6) || (j==8 && i<=6) || (j==2 && i==7) || (j==3 && i==8) || (j==5 && i==8)|| (j==7 && i==7) ){
                System.out.print("U");
                }
                
                else{
                System.out.print(" ");
                }
               
              }
              System.out.println();
           }    
        }
    }
