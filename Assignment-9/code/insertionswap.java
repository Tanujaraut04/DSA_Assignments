import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=s.nextInt();
		System.out.println("Enter Array:");
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length-1;i++){
			for(int j=i;j>=0;j--){
				if(arr[j]<arr[i+1]){
					break;
				}
				int temp=arr[j];
				arr[j]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}