import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int len=s.nextInt();
		int[]arr=new int[len];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}	
		int max=f(arr,0);
		System.out.println(max);
	}
	static int f(int[]arr,int index){
		if(index==arr.length-1){
			return arr[index];
		}int max=f(arr,index+1);
		if(arr[index]>max){
			max=arr[index];
		}
		 int s_max=f(arr,index+1);
		if(arr[index]>s_max&&arr[index]<max){
			return arr[index];
		} 
		
		return s_max;
	}
}