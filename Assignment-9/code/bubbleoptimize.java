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
		}boolean isoptimize=false;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]<arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isoptimize=true;
				}
			}
			if(!isoptimize){
				break;
			}
				
		}
		System.out.println(Arrays.toString(arr));
	}
}