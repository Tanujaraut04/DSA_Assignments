import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size:");
		int len = s.nextInt();
		System.out.println("Enter Array:");
		int[]arr=new int[len];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			int min=arr[i];
			int index=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<min){
					min=arr[j];
					index=j;
				}
			}
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}