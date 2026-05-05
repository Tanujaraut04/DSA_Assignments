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
		}int min=arr[0];int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}else{
				if(arr[i]<min){
					min=arr[i];
				}
			}
		}
		System.out.println("Maximum:"+max);
		System.out.println("Minimum:"+min);
		
	}
}