import java.util.*;
  class Test{
	String name;
	int id;
	
	public Test(String na, int k){
		this.name=na;
		this.id=k;		
	}
	public static void main(String[] args){
		Test obj = new Test("atul", 1);
		Test km = new Test("Kumar", 2);
		System.out.println("First employ name "+ obj.name+" and id is " +obj.id);
		System.out.println("Second employ name "+ km.name+" and id is " +km.id);
	}
}