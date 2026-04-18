import java.util.*;
class Demo {
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	String n=s.next();
	char ch=0;
        for(int i=0;i<s.length();i++){
		ch=s.charAt(i);
		
	}
	HashMap<Integer, Integer> hm = new HashMap<>();
	for(int num:n){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }int max=0;
	for(int num:n){
           if(num>max){
			max=num;
		}
        }
	for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            if(e.getValue()==max){
                System.out.println(e.getKey());  
            }
        }
    }
}