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
		}int maximum=0;
		if(freq1.length>freq2.length){
			maximum=freq1.length;
		}else{
			maximum=freq2.length;
		}
		int index=0;int size=0;
		while(fre
			if(freq1[index]!=0&&freq2[index]!=0){
				if(freq1[index]==freq2[index]){
					size=freq1[index];	
				}
			}
			index++;
		}
		int[]insertion=new int[size];
		for(int i=0;i<insertion.length;i++){
			insertion[i]=size;
		}
		System.out.println(Arrays.toString(insertion));
				
	}
}