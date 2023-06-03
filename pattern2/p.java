/*p*/
class Main{
  public static void main(String args[]){
          
       int i,j;
         
       
        for(i=1;i<=7;i++)
           { 
              for(j=1;j<=7;j++)
              
                 { 
              if(j==1||((i==1||i==4)&&j==2)||((i==2||i==3)&&j==4))
                 System.out.print("p ");
             else
                 System.out.print(" ");       
                 }
               
              
              System.out.println();
           }    
        }
}
