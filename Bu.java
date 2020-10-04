import java.util.*;

class Bu{
	public static void main(String[] args){
		String a[]={"Shobhit","Atul","Utkarsh","Alok","Ankur","Aish"};
		String temp;
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j].compareTo(a[j+1])>0){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("The result");
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}
	}
}