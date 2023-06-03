/*l*/
class Main{
    public static void main(String args[]){     
     
int i,j;
    
    for(i=3;i<=7;i++){
         for(j=1;j<=5;j++)
          { 
          if((j==3 && i>=3) || (j==2 && i==3)  || (i==7 && j==4))
          System.out.print("l");
          
          else
                System.out.print(" ");   
            
          }
      System.out.println();
    }

}
}
