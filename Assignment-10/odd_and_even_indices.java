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
		}System.out.print("Even indices:");
		for(int i=0;i<arr.length;i+=2){
			System.out.print(arr[i]+" ");
		}System.out.println();
		System.out.print("Odd indices:");
		for(int i=1;i<arr.length;i+=2){
			System.out.print(arr[i]+" ");
		}
		
	}
}