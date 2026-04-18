import java.util.*;
class Demo {
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int n=s.nextInt();
        int[] arr = new int[n];
	for(int i=0;i<arr.length;i++){
		arr[i]=s.nextInt();
	}
	HashMap<Integer, Integer> hm = new HashMap<>();
	for(int num:arr){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }
	for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            if(e.getValue()==1){
                System.out.println(e.getKey());  
            }
        }
    }
}