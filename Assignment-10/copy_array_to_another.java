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
		}int[]n_arr=new int[arr.length];
		for(int i=0;i<n_arr.length;i++){
			n_arr[i]=arr[i];
		}
		System.out.println(Arrays.toString(n_arr));
		
	}
}