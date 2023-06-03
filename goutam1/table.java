import java.util.Scanner;
class Main{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
System.out.println(" Enter the value to print table ");
int ch =sc.nextInt();
int s;
for(int i=1 ; i<=10;i++){
s=i*ch;
System.out.println(ch+"*"+i+"="+s);
}



}

}

