import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int cnt=1;
		int num=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=cnt;k++){
				if(i%2==0&&(i+k)%2==0||i%2==1&&(i+k)%2==1){
					System.out.print(" ");
				}else{
					System.out.print(num);
					num++;
				}
			}System.out.println();
			num=1;
			cnt+=2;
		}cnt-=4;
		for(int i=1;i<=n-1;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
		for(int k=1;k<=cnt;k++){
				if(i%2==0&&(i+k)%2==0||i%2==1&&(i+k)%2==1){
					System.out.print(" ");
				}else{
					System.out.print(num);
					num++;
				}
			}System.out.println();
			num=1;
			cnt-=2;
			}
	}
}