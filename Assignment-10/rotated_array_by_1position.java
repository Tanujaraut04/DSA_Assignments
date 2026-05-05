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
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++){
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		System.out.println(Arrays.toString(arr));
		}
}