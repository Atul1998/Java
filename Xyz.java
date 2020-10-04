import java.util.*;

class Xyz extends Poly{
	void add(int a, int b){
		int c =a+b;
		System.out.println(c);		
	}
	public static void main(String[] args){
		Xyz e = new Xyz();
		e.add(10,20);
		Poly k = new Poly();
		k.add(30,10);
	}
}
class Poly{
	void add(int a, int b){
		int c=a+b;
		System.out.println(c);
	}
}

