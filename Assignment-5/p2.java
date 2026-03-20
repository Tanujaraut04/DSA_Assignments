import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
			while(n>0){
				int rem=n%10;
				System.out.println(rem);
				n=n/10;
			}

		}
}