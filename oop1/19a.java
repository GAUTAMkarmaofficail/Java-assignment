/*19) Make list of Students having name, roll no., age, score. Write a program to accept 10 students record and arrange?
 the Students based on the score group [0-50], [50-65],[65-80],[80-100].*/
import java.util.Scanner;
  class Student{
    private int rollno[],age[],score[];String name[];
    public Student(String name[],int rollno[],int age[],int score[]){
        this.name=name;
        this.rollno=rollno;
        this.age=age;
        this.score=score;
    }
    public void m1(){
        for(int i=0;i<10-1;i++){
			for(int j=i+1;j<10;j++){
			    if(score[i]<score[j]){
					int temp;
					temp=score[i];
					score[i]=score[j];
					score[j]=temp;
				 }				
			 }			
		} 
    }
    public void m2(){
        for(int i=0;i<10-1;i++){
			for(int j=i+1;j<10;j++){
			    if(score[i]<score[j]){
					String temp;
					temp=name[i];
					name[i]=name[j];
					name[j]=temp;
				 }				
			 }			
		} 
    }
    public void m3(){
        for(int i=0;i<10-1;i++){
			for(int j=i+1;j<10;j++){
			    if(score[i]<score[j]){
					int temp;
					temp=rollno[i];
					rollno[i]=rollno[j];
					rollno[j]=temp;
				 }				
			 }			
		} 
    }
    public void m4(){
        for(int i=0;i<10-1;i++){
			for(int j=i+1;j<10;j++){
			    if(score[i]<score[j]){
					int temp;
					temp=age[i];
					age[i]=age[j];
					age[j]=temp;
				 }				
			 }			
		} 
    }

    public void display(){
        System.out.println("Name  \t\t\t\tRollno\t\t\t\tAge   \t\t\t\tScore ");
        for(int i=0;i<10;i++){        
           System.out.println(name[i]+  "\t\t\t\t"+rollno[i]+"\t\t\t\t"+age[i]+   "\t\t\t\t"+score[i] );
        }
    }

  }
  class Main{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);  
       String name[]=new String[10];
       int rollno[]=new int[10];
       int age[]=new int[10];
       int score[]=new int[10];
       int i;
       System.out.println("Enter name of students");
       for(i=0;i<10;i++){
          name[i]=sc.nextLine();
          
       }
       System.out.println("Enter Rollno of students");
       for(i=0;i<10;i++)
          rollno[i]=sc.nextInt();

       System.out.println("Enter age of students");
       for(i=0;i<10;i++)
          age[i]=sc.nextInt();

       System.out.println("Enter Score of students");
       for(i=0;i<10;i++)
          score[i]=sc.nextInt();

        Student obj=new Student(name,rollno,age,score);
        obj.m2();
        obj.m3();
        obj.m4();
        obj.m1();
     
        obj.display();
    }
  }
