import java.util.*;
  class Comp{
	public static void main(String[] args){
		Empolyee obj = new Empolyee();
		obj.setEmp(101);
		System.out.println(obj.getEmp());
	}
 }

 class Empolyee{
	private int empid;
	public void setEmp(int eid){
		empid=eid;
	}
	public int getEmp(){
		return empid;
	}
 }
 
