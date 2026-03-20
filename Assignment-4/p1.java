import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n-1;i++){
			for(int j=1;j<=n;j++){
				System.out.print(0);
			}System.out.println();
		}

	}
}
//TimeComplexity:O(n^2)
//SpaceComplexity:O(1)