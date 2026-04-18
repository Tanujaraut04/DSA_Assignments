import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int len1 = s.nextInt(); 
		int len2 = s.nextInt();
		int[]arr1=new int[len1];
		int[]arr2=new int[len2];
		for(int i=0;i<arr1.length;i++){
			arr1[i]=s.nextInt();
		}
		for(int i=0;i<arr2.length;i++){
			arr2[i]=s.nextInt();
		}
		int index=0;
		while(index<arr1.length&&index<arr2.length){
			index++;
		}int missing=0;
		while(index<arr1.length){
			mis=sing=arr1[index];
			index++;
		}
		while(index<arr2.length){
			missing=arr2[index];
			index++;
		}
		System.out.println(missing);
		
	}
}