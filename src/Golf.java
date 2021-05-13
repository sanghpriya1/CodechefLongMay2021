import java.util.Scanner;

public class Golf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int N =  sc.nextInt();
			int x =  sc.nextInt();
			int k =  sc.nextInt();
			int sum = (N + x + k)*5;
			System.out.println(sum);
		}
		sc.close();
	}
}
