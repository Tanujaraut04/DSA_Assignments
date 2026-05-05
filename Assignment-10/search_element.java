import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size:");
		int len=s.nextInt();
		System.out.print("Enter Target:");
		int target=s.nextInt();
		System.out.print("Enter Array:");
		int[]arr=new int[len];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}int cnt=0;int index=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				cnt++;
				index=i;
			}
		}
		if(cnt!=0){
			System.out.println("index:"+index);
		}else{
			System.out.println("index:"+index);
			}
		}
}