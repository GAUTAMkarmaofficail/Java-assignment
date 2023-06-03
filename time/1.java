import java.util.Scanner;
class Time{
  private int h,m,s;
    public Time(int h, int m,int s){
    this.h=h;
    this.m=m;
    this.s=s;
    }
 public Time(){
 //return 0; 
}
  public void display(){
  System.out.println(h+":"+m+":"+s);
  }
  public Time addTime(Time k){
    Time temp = new Time();
    temp.h=this.h+k.h;
    temp.m=this.m+k.m;
    temp.s=this.s+k.s;
   if(temp.s>=60)
  {
   temp.m++;
   temp.s=temp.s-60;
  }
 if(temp.m>=60){
 temp.h++;
 temp.m=temp.m-60;
  }
  return temp;
  }
}
class Main{
    public static void main(String args[]){
      
      Time t1 = new Time (12,60,60);
      Time t2 = new Time (12,60,60);
      
      Time t3= new Time();
      t3=t1.addTime(t2);
      t1.display();
      t2.display();
      t3.display();
      
    }
  }
