class Xyz1{
	public static void main(String[] args){
		Test1 obj = new Test1();
		obj.getValue(10);
		obj.show();
	}
}
class Test1{
	int i;
	void getValue(int i){
	    this.i=i;
	}
	void show(){
	    System.out.println(i);
	}
}

