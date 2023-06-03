/*class Main{
    public static void main(String args[]){     
     
int i,j;
    
    for(i=1;i<=11;i++){
         for(j=1;j<=19;j++)
          {         
            if( i == 10 || j == (11-i)|| i==j-9)
             System.out.print("*");
            else
             System.out.print(" ");
          }
      System.out.println();
    }

}
}*/
class Main{
    public static void main(String args[]){     
     
int i,j;
     //for(i=1;i<=20;i++) try for it in future for clarification 

    for(i=21;i>=11;i--){
         for(j=1;j<=21;j++)
          {         
            if(j>i||j<=21-i)
             System.out.print(" ");
            else
             System.out.print("*");
          }
      System.out.println();
    }

    

  }
}
