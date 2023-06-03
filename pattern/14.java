
class Main{
    public static void main(String args[]){     
     
int i,j;
    
    for(i=10;i>=1;i--){
         for(j=1;j<=10;j++)
          {         
            if(j<=10-i)
             System.out.print(" ");
            else
             System.out.print("*");
          }
      System.out.println();
    }
    

}
}
