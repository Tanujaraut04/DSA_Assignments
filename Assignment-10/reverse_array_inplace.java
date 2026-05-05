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
		}int right=arr.length-1;
		int mid=right/2;
		for(int i=0;i<=mid;i++){
			int temp=arr[i];
			arr[i]=arr[right];
			arr[right]=temp;
			right--;
		}
		System.out.println(Arrays.toString(arr));
	}
}