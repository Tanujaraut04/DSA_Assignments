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
		
		f(arr,0,arr.length-1);	
		System.out.println(Arrays.toString(arr));
		
	}
	static void  f(int[]arr,int low,int high){
		if(low==high){
			return;
		}
		int mid=(low+high)/2;
		f(arr,low,mid);
		f(arr,mid+1,high);
		sorted(arr,low,mid,high);
		 
	}
	static void sorted(int[]arr,int low,int mid,int high){
		int[]sort=new int[high-low+1];
		int f_arr=low;
		int s_arr=mid+1;
		int incre=0;
		while(f_arr<=mid&&s_arr<=high){
			if(arr[f_arr]<arr[s_arr]){
				sort[incre]=arr[f_arr];
				incre++;
				f_arr++;
			}else{
				sort[incre]=arr[s_arr];
				incre++;
				s_arr++;
			}
		}
		while(f_arr<=mid){
			sort[incre]=arr[f_arr];
				incre++;
				f_arr++;
		}
		while(s_arr<=high){
			sort[incre]=arr[s_arr];
				incre++;
				s_arr++;
		}
		for(int i=0;i<sort.length;i++){
			arr[low+i]=sort[i];
		}
		
		
	} 
	
}