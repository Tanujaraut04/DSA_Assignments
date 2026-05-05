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
		}int n=arr.length-1;
		int temp=arr[n];
		for(int i=0;i<n;i++){
		arr[n-i]=arr[n-i-1];
		}
		arr[0]=temp;
		System.out.println(Arrays.toString(arr));
	}
}