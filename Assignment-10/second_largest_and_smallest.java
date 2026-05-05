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
		}
		Arrays.sort(arr);
		System.out.println("Second Largest:"+arr[arr.length-2]);
		System.out.println("Second Smallest:"+arr[1]);
				
	}
}