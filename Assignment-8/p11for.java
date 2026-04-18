import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		boolean isAnagram = true;
		for(int i=0;i<str1.length();i++){
			int cnt1=0;
			int cnt2=0;
			int ch = str1.charAt(i);
			ch=ch-'a';
			for(int j=0;j<str1.length();j++){
				if(ch==str1.charAt(i)){
					cnt1++;
				}
			}
			for(int j=0;j<str2.length();j++){
				if(ch==str2.charAt(i)){
					cnt2++;
				}
			}
		if(cnt1!=cnt2){
			isAnagram=false;
			break;
		}
	}
		System.out.println(isAnagram);
	}
}