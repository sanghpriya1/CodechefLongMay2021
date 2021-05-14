import java.util.Scanner;

public class Golf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int N = sc.nextInt();
			int x = sc.nextInt();
			int k = sc.nextInt();
			int reverse = N+1 - x;
			if (x % k == 0 || reverse%k == 0)
				System.out.println("Yes");
			else
				System.out.println("No");

		}
		sc.close();
	}
}
