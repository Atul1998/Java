import java.util.*;
  public class Even{
      public static void main(String[] args){
                Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value");
 		int k = obj.nextInt();
		if(k%2==0){
 		   System.out.println(k+ " Even");
		}
		else{
	           System.out.println(k+" odd");
		}
        }
    }