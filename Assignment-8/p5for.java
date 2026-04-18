import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int len=s.nextInt();
		int[]arr=new int[len];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		int arr_size=0;
		int index=0;
		for(int i=0;i<arr.length;i++){
			int cnt=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					cnt++;
				}
			}
		if(cnt==1){
			arr_size++;
			}
		}
		int[]n_arr=new int[arr_size];
		for(int i=0;i<arr.length;i++){
			int cnt=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					cnt++;
				}
			}
		if(cnt==1){
			n_arr[index]=arr[i];
			index++;
			}
		}
		System.out.println(Arrays.toString(n_arr));
	}
}