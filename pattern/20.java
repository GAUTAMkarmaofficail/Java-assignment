class Main{
    public static void main(String args[]){     
     
int i,j;
 for(i=1;i<=16;i++)
{
for(j=1;j<=8;j++)
if(j>=i||j>=(17-i))
System.out.print("*");
else
System.out.print(" ");
System.out.println();

}

}

}
