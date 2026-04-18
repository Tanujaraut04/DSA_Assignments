import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int len = s.nextInt();
		int[]arr=new int[len];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		int[]freq=new int[max+1];
		for(int i=0;i<arr.length;i++){
			freq[arr[i]]++;
		}
		
		for(int i=0;i<freq.length;i++){
			for(int j=0;j<freq.length;j++){
				if(arr[i]==j){
					arr[i]=freq[j];
					break;
					}
				}
			}
		
		System.out.println(Arrays.toString(arr));
	}
}