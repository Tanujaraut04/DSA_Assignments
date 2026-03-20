import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			int cnt=1;
			for(int j=1;j<=n;j++){
				System.out.print(cnt);
				cnt++;	
			}System.out.println();
	
		}

	}
}
//TimeComplexity:O(n^2)
//SpaceComplexity:O(1)