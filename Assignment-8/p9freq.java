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
		}int max1=arr1[0];
		for(int i=1;i<arr1.length;i++){
			if(arr1[i]>max1){
				max1=arr1[i];
			}
		}int max2=arr1[0];
		for(int i=1;i<arr2.length;i++){
			if(arr2[i]>max2){
				max2=arr2[i];
			}
		}
		int[]freq1=new int[max1+1];
		int[]freq2=new int[max2+1];
		for(int i=1;i<arr1.length;i++){
			freq1[arr1[i]]++;
		}
		for(int i=1;i<arr2.length;i++){
			freq2[arr2[i]]++;
		}
		int index=0;
		while(index<freq1.length&&index<freq2.length){
			index++;
		}int missing=0;
		while(index<freq1.length){
			missing=index;
			index++;
		}
		while(index<freq2.length){
			missing=index;
			index++;
		}
		System.out.println(missing);
		
	}
}