import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=s.nextInt();
		int []arr=new int[n];
		System.out.println("Enter Array:");
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		for(int i=1;i<arr.length;i++){
			int num=i-1;
			int current=arr[i];
			while(num>=0&&arr[num]>current){
				
				arr[num+1]=arr[num];					
				
				num--;
			}
		arr[num+1]=current;	
		}
		System.out.println(Arrays.toString(arr));
	}
}