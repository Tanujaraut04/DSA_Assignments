class Demo{
	public static void main(String[]args){
		int a=12;
		int b=18;
		int min=0;
		int gcd=1;
		if(a>b){
			min=b;
		}else{
			min=a;
		}
		for(int i=1;i<min;i++){
			if(min%i==0){
				gcd=i;
				}
			}
		System.out.println(gcd);
		
	}
}