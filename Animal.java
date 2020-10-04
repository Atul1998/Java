import java.util.*;
  class Animal{
	String co;
	int a;
	
	void color(String c, int k){
		co=c;
		a=k;
	}
	void display(){
		System.out.println(co +" "+ a);
	}
	public static void main(String[] args){
		Animal boj = new Animal();
		boj.color("Black",10);
		boj.display();
	}
}