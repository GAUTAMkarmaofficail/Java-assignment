import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        int n;
        int temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the "+(i+1)+" element : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Origional Array : ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        System.out.print("Array with it's factorial : ");
        for(int i=0;i<n;i++)
        {
            int f=1;
            for(int j=1;j<=arr[i];j++)
                f=f*j;
            temp=arr[i];
            arr[i]=f;
            f=arr[i];
            System.out.print(f+" ");
        }
    }
}
