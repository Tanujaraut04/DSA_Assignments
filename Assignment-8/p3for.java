import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int len=s.nextInt();
		int[]arr=new int[len];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		int k=s.nextInt();
		
		for(int i=0;i<arr.length;i++){
			int cnt=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					cnt++;
				}
			}
			if(cnt==k){
				System.out.println(arr[i]);
			}
		}
		
	}
}