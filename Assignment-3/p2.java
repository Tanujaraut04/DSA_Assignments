import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int cnt=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			for(int k=1;k<=2*(n-i);k++){
				System.out.print(" ");
			}
			for(int m=i;m>=1;m--){
				System.out.print(m);
			}System.out.println();
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i+1;j++){
				System.out.print(j);
			}
			for(int k=1;k<=cnt;k++){
				System.out.print(" ");
			}
			for(int m=n-i+1;m>=1;m--){
				System.out.print(m);
			}System.out.println();
			cnt+=2;
		}
	}
}