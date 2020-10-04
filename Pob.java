import java.util.*;

 class Pob{
     public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		String arr[] = new String[n];
		String temp;
		for(int i=0;i<n;i++){
			arr[i] = obj.nextLine();
		}
		for(int k=0;k<arr.length;k++){
	 	    for(int j=0;j<arr.length-1-k;j++){
			   if(arr[j].compareTo(arr[j+1])>0){
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			   }
			}
		}
		  System.out.println(arr[0]);
		
	}
 }