import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		int[]arr=new int[26];
		boolean isPangram=true;
		for(int i=0;i<str.length();i++){
			int  ch=str.charAt(i); 
			ch=ch-'a';
			for(int j=0;j<arr.length;j++){
				if(ch!=j){
					 isPangram=false;
					}
			}
		
		}
		System.out.println(isPangram);
	}
}