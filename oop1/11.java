//11) How to pass as many argument to java method
class Test{
	public void data(int... x){
		for(int ele : x)
			System.out.println(ele);
	}
}
class Main{
	public static void main(String args[]){
		Test obj = new Test();
		obj.data(1,2,3,4,5);
	
	}
}
