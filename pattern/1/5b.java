class Main{
    public static void main(String args[]){     
     
int i,j,k;
    
    for(i=1;i<=5;i++){

    for(k=5;k>i;k--)
       System.out.print(" ");
    for(j=1;j<=i;j++)
     {
     if(i==5||i==j||j==1)
       System.out.print(" "+j);
     else
       System.out.print("  ");

     }
     System.out.println();
   }
  }
}
