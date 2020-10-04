import java.util.*;
  abstract class Vehicle{
      abstract void start();
  }
  class Car extends Vehicle{
	void start(){
	   System.out.println("Starts from Key");
	}
  }

  class Schooter extends Vehicle{	
	void start(){
	     System.out.println("Start from kick");
	}
	public static void main(String[] arg){
		Car k = new Car();
		k.start();
		Schooter b = new Schooter();
		b.start();
	}
  }