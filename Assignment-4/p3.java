import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i>=2&&i<=3 && j>=2&&j<=4){
					System.out.print("-");
					}else{
					System.out.print(0);
				}
			}System.out.println();
		}

	}
}
//TimeComplexity:O(n^2)
//SpaceComplexity:O(1)