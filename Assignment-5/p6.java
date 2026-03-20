import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int num=n;
		int cnt=0;
		int sum=0;
		while(n>0){
			int rem=n%10;
			cnt++;
			n=n/10;
		}n=num;
		while(n>0){
			int digit=n%10;
			int power=1;
			for(int i=1;i<=cnt;i++){
				power=power*digit;
			}
			sum=power+sum;
			n=n/10;
		}
		if(num==sum){
			System.out.println("Armstrong Number");
		}else{
			System.out.println("Not Armstrong Number");
		}
	}
}