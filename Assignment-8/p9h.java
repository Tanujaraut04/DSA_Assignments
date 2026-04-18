import java.util.*;
class Demo {
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int n1=s.nextInt();
	int n2=s.nextInt();
        int[] arr1 = new int[n];
	for(int i=0;i<arr1.length;i++){
		arr1[i]=s.nextInt();
	}
	 int[] arr2 = new int[n];
	for(int i=0;i<arr2.length;i++){
		arr2[i]=s.nextInt();
	}

	HashMap<Integer, Integer> hm = new HashMap<>();
	HashMap<Integer, Integer> map = new HashMap<>();
	for(int num:arr1){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }
	for(int num:arr2){
            hm.put(num, map.getOrDefault(num,0)+1);
        }
	 for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            if(hm.getValues().equals(map.getValues())){
    		System.out.println("Keys same");
		}