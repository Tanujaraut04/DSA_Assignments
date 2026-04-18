class Demo{
	public static void main(String[]args){
		int[]arr={10,5,8,15,20};
		int max=0;
		int s_max=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>s_max&&arr[i]<max){
				s_max=arr[i];
			}
		}
		System.out.println("Second Largest:"+s_max);
	}
}