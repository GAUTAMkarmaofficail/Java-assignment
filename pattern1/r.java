/*
R
*/

class Main{
  public static void main(String args[]){
          
       int i,j;
         
       
        for(i=1;i<=7;i++)
           { 
              for(j=1;j<=7;j++)
              
                 { 
              if(j==1||((i==1||i==4||i==5)&&j==2)||((i==2||i==3||i==6)&&j==4)||(i==7&&j==5))
                 System.out.print("R ");
             else
                 System.out.print(" ");       
                 }
               
              
              System.out.println();
           }    
        }
}
