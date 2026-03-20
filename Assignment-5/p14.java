import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<n;i++){
			int divisor=n%i;
			if(divisor==0){
				sum=sum+i;
			}
		}
		if(n==sum){
			System.out.println("Perfect Number");
		}else{
			System.out.println("Perfect Number");
			}
		
	}
}