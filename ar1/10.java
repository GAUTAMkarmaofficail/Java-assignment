import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
   int i,j,countN=0,countE=0,countO=0;
   String indN= "",indE= "",indO= "";
   
  System.out.println("Enter array length");
   int n = sc.nextInt();
   
   int arr[]= new int[n];

  for( i=0;i<n;i++)
  {
    System.out.println("Enter element Value");
    arr[i]=sc.nextInt();
  }
   for(j=0;j<arr.length;j++)
  {  if(arr[j] < 0)
    { countN++;
      indN=indN+" "+j;
    }
    else if(arr[j]>=0)
    { if(arr[j]%2==0)
      {countE++;
       indE=indE+" "+j;
      }
      else
      {countO++;
       indO=indO+" "+j;
      }
    }
    }
    if(countE>0)
    System.out.println("Total even "+countE+" at index "+indE);
    if(countO>0)
    System.out.println("Total Odd "+countO+" at index "+indO);
    if(countN>0)
    System.out.println("Total Negative "+countN+" at index "+indN);
   
  }
}
