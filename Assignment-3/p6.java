import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int num=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
				}
			for(int k=1;k<=i;k++){
				System.out.print(num+" ");
				num++;
			} System.out.println();
			
		}
		for(int i=n-1;i>=1;i--){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
				}
			for(int k=1;k<=i;k++){
				System.out.print(num+" ");
				num++;
			} System.out.println();
			
		}
	}
}