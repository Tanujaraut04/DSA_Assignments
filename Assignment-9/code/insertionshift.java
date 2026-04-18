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
		for(int i=0;i<arr.length-1;i++){
			int num=i;
			int current=arr[i+1];
			while(num>=0){
				
				if(arr[num]<current){					
					break;
				}
				arr[i+1]=arr[num];
				num--;
			}
		arr[num+1]=current;	
		}
		System.out.println(Arrays.toString(arr));
	}
}