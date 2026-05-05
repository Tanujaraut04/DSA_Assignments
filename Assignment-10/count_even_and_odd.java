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
		}int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				even++;
			}else{
				odd++;
			}
		}
		System.out.println("Even:"+even);
		System.out.println("Odd:"+odd);
		
	}
}