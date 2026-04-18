import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		String str = s.next();
		boolean isPangram=true;
		int[]freq=new int[26];
		for(int i=0;i<str.length();i++){
			freq[str.charAt(i)-'a']++;
		}
		int max=0;
		char ch=0;
		for(int i=0;i<freq.length;i++){
			if(freq[i]==0){
				isPangram=false;
				break;
			}
		}
		System.out.println(isPangram);
	}
}