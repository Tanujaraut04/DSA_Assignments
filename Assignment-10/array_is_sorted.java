import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size:");
		int len=s.nextInt();
		System.out.print("Enter Array:");
		int[]arr=new int[len];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}boolean is_sorted=true;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				 is_sorted=false;
			}
		}
		System.out.println("Array is sorted:"+ is_sorted);
		
	}
}