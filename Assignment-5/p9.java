import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int cnt=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				cnt++;
			}
		}
		if(cnt==2){
			System.out.print("Prime No");
		}else{
			System.out.print("Not Prime No");
		}
	}
			
}