import java.util.*;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
	int num = 2*n - 1;

        for(int i = 1; i <=num; i++) {
            for(int j = 1; j <=num; j++) {

                int top = i-1;
                int left = j-1;
                int right = 2*n - 1 - j;
                int bottom = 2*n - 1 - i;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print(n - min + " ");
            }
            System.out.println();
        }
    }
}