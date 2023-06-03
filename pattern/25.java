class Main{
    public static void main(String args[]){     
     
int i,j;
    
    for(i=1;i<=15;i++){
         for(j=1;j<=15;j++)
          {         
            if(  j == (16-i)|| i==j)
             System.out.print("*");
            else
             System.out.print(" ");
          }
      System.out.println();
    }

}
}
