import java.util.Scanner;

public class Golf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int N = sc.nextInt();
			int x = sc.nextInt();
			int k = sc.nextInt();
			int reverse = N - x;
			reverse += 1;
			if (x % k == 0)
				System.out.println("YES");
			else if (reverse % k == 0)
				System.out.println("YES");
			else
				System.out.println("NO");

		}
		sc.close();
	}
}
