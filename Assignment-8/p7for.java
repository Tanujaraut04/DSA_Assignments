import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int len=s.nextInt();
		int[]arr=new int[len];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		int num=0;
		int max=0;
		for(int i=0;i<arr.length;i++){
			int cnt=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					cnt++;
				}
			}
		if(cnt>max){
			max=cnt;
			}
		}
		int s_max=0;
		for(int i=0;i<arr.length;i++){
			int cnt=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					cnt++;
				}
			}
		if(cnt>s_max&&cnt<max){
			s_max=cnt;
			num=arr[i];
			}
		}
		System.out.println(num);
	}
}