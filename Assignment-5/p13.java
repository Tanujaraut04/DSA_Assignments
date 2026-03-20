import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		int gcd=1;
		while(num1>0&&num2>0){
			if(num1>num2){
				num1=num1%num2;
			}else{
				num2=num2%num1;
			}
		}
		if(num1==0){
			gcd=num2;
		}else{
			gcd=num1;
		}
		if(gcd==1){
			System.out.println("Co-Prime Number");
		}else{
			System.out.println("Not Co-Prime Number");
		}
	}
}