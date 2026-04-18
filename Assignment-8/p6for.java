import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int max=0;
		char freq=0;
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			int cnt=0;
			for(int j=0;j<str.length();j++){
				if(ch==str.charAt(j)){
					cnt++;
				}
			}
		if(cnt>max){
			max=cnt;
			freq=ch;
					
			}
		}
		System.out.println(freq);
	}
}