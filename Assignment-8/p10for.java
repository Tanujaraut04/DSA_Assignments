import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int len1=s.nextInt();
		int len2=s.nextInt();
		int[]arr1=new int[len1];
		int[]arr2=new int[len2];
		
		for(int i=0;i<arr1.length;i++){
			arr1[i]=s.nextInt();
		}
		for(int i=0;i<arr2.length;i++){
			arr2[i]=s.nextInt();
		}int cnt=0;int num1=0;
		for(int i=0;i<arr1.length;i++){
			for(int j=num1;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					cnt++;
					num1++;
				}
			}
		}int[]n_arr=new int[cnt];
		int num=0;
		int index=0;
		for(int i=0;i<arr1.length;i++){
			for(int j=num;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					n_arr[index]=arr1[i];
					num++;
					index++;
				}
			}
		}
		System.out.println(Arrays.toString(n_arr));
	}
}