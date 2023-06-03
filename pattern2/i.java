/*i*/
class Main{
    public static void main(String args[]){     
     
int i,j;
    
    for(i=1;i<=7;i++){
         for(j=1;j<=5;j++)
          { 
          if((j==3 && i>=3) || (j==2 && i==3) || (j==3 && i==1) || (i==7 && j==4))
          System.out.print("i");
          
          else
                System.out.print(" ");   
            
          }
      System.out.println();
    }

}
}
