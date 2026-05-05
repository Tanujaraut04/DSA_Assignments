import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size:");
		int len=s.nextInt();
		System.out.print("Enter k Position:");
		int k=s.nextInt();
		System.out.print("Enter Array:");
		int[]arr=new int[len];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		k=k%arr.length;
		rotate(arr,0,k-1);
		rotate(arr,k,arr.length-1);
		rotate(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	static void rotate(int[]arr,int low,int high){
		int left=low;
		int right=high;
		while(left<right){
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
	}
}