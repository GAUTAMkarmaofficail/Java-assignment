/*g*/
class Main{
  public static void main(String args[]){
  int i,j;
  for(i=1;i<=7;i++){
  
   for(j=1;j<=4;j++)
    
    if(i==1&&j>1||j==4&&i<7||i==7&&j<4||i==4&&j>1||j==1&&(i>1&&i<4))
    System.out.print("g ");
    else 
    System.out.print("  ");
    
    System.out.println();
    
    
      }
  }
}
