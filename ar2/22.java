/*22*/
import java.util.Scanner;
 class Main
{
    public static void main(String[] args)
    {
        int k;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. which you want to nearest min and max ");
        k=sc.nextInt();
        int [] intArray = new int [] {52,45,32,64,12,87,78,98,23,7};
        int temp ;
        System.out.println("Original array: ");
        for (int i = 0; i <intArray.length; i++)
        {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i <intArray.length; i++)
        {
            for (int j = i+1; j <intArray.length; j++)
            {
                if(intArray[i] >intArray[j])
                {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        for (int i = 0; i <intArray.length; i++)
        {
            System.out.print(intArray[i] + " ");
        }
        System.out.println("\n"+k+"  nearest min "+intArray[k-2] + "\n "+k+"nearest max  "+ intArray[k] + " ");

    }
}
