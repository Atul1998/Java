import java.util.*;

 class Pob{
     public static void main(String[] args){
		System.out.println("Enter the total number in array");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int arr[] = new int[n];
		int temp;
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++){
			arr[i] = obj.nextInt();
		}
		for(int k=0;k<arr.length;k++){
	 	    for(int j=0;j<arr.length-1-k;j++){
			   if(arr[j]>arr[j+1]){
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			   }
			}
		}
		System.out.println("After Shoting");
		for(int m=0;m<arr.length;m++){
		  System.out.println(arr[m]);
		}
		
	}
 }