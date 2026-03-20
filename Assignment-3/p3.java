import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int cnt=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==j||i+j==n+1){
					System.out.print(cnt);
				}else{
					System.out.print(" ");
				}
			}cnt++;
			System.out.println();
		}
	}
}